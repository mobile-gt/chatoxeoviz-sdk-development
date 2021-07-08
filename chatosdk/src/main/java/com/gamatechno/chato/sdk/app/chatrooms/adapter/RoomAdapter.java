package com.gamatechno.chato.sdk.app.chatrooms.adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gamatechno.chato.sdk.R;
import com.gamatechno.chato.sdk.app.chatrooms.uimodel.ChatRoomsUiModel;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RoomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {

    Context context;
    List<ChatRoomsUiModel> chatList;
    List<ChatRoomsUiModel> chatListSort;
    OnObrolanAdapter onObrolanAdapter;

    boolean isLoading = false;

    public RoomAdapter(Context context, List<ChatRoomsUiModel> chatList, OnObrolanAdapter onObrolanAdapter) {
        this.context = context;
        this.chatList = chatList;
        chatListSort = this.chatList;
        this.onObrolanAdapter = onObrolanAdapter;
    }

    public RoomAdapter(Context context, OnObrolanAdapter onObrolanAdapter) {
        this.context = context;
        this.chatList = new ArrayList();
        chatListSort = this.chatList;
        this.onObrolanAdapter = onObrolanAdapter;
    }

    public void initLoading(boolean istrue){
        isLoading = istrue;
        notifyDataSetChanged();
    }

    public List<ChatRoomsUiModel> getData(){
        return chatListSort;
    }

    public void addData(boolean isRefresh, List<ChatRoomsUiModel> list){
        if(isRefresh) {
            chatList.clear();
            chatListSort.clear();
        }

        Collections.sort(list, (lhs, rhs) ->
                rhs.getRoomChat().getRoom_type().compareTo(lhs.getRoomChat().getRoom_type()));

        chatList.addAll(list);
        chatListSort.addAll(chatList);
        notifyDataSetChanged();
    }

    public void filterChat(int type) {
        if (type == 1) {
            Collections.sort(chatListSort, (lhs, rhs) ->
                    lhs.getRoomChat().getRoom_name().compareTo(rhs.getRoomChat().getRoom_name()));
            notifyDataSetChanged();
        } else if (type == 2) {
            Collections.sort(chatListSort, (lhs, rhs) ->
                    rhs.getRoomChat().getRoom_name().compareTo(lhs.getRoomChat().getRoom_name()));
            notifyDataSetChanged();
        } else if (type == 3) {
            Log.d("KENALOG", "data dari chatList" + new Gson().toJson(chatList));
            chatListSort.clear();
            chatListSort.addAll(chatList);
            notifyDataSetChanged();
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_chat_rooms, viewGroup, false);
        return new ChatroomViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if(isLoading){
            ((ChatroomViewHolder)viewHolder).bindLoading();
        } else {
            ChatRoomsUiModel model = chatListSort.get(i);
            ((ChatroomViewHolder)viewHolder).bindDatas(model);

            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    onObrolanAdapter.onLongClick(model);
                    return true;
                }
            });

            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onObrolanAdapter.onClickObrolan(model);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        if(isLoading){
            return 4;
        } else {
            return chatListSort.size();
        }

    }

    public interface OnObrolanAdapter{
        void onClickObrolan(ChatRoomsUiModel model);
        void onLongClick(ChatRoomsUiModel model);
    }
}

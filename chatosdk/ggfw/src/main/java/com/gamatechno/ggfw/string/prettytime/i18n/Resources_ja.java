/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018. Shendy Aditya Syamsudin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.gamatechno.ggfw.string.prettytime.i18n;

import com.gamatechno.ggfw.string.prettytime.Duration;
import com.gamatechno.ggfw.string.prettytime.TimeFormat;
import com.gamatechno.ggfw.string.prettytime.TimeUnit;
import com.gamatechno.ggfw.string.prettytime.impl.TimeFormatProvider;
import com.gamatechno.ggfw.string.prettytime.units.Decade;
import com.gamatechno.ggfw.string.prettytime.units.Millennium;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Resources_ja extends ListResourceBundle implements TimeFormatProvider
{
   private static final Object[][] OBJECTS = new Object[][] {
            { "CenturyPattern", "%n%u" },
            { "CenturyFuturePrefix", "δ»γγ" },
            { "CenturyFutureSuffix", "εΎ" },
            { "CenturyPastPrefix", "" },
            { "CenturyPastSuffix", "ε" },
            { "CenturySingularName", "δΈη΄" },
            { "CenturyPluralName", "δΈη΄" },
            { "DayPattern", "%n%u" },
            { "DayFuturePrefix", "δ»γγ" },
            { "DayFutureSuffix", "εΎ" },
            { "DayPastPrefix", "" },
            { "DayPastSuffix", "ε" },
            { "DaySingularName", "ζ₯" },
            { "DayPluralName", "ζ₯" },
            { "DecadePattern", "%n%u" },
            { "DecadeFuturePrefix", "δ»γγ" },
            { "DecadeFutureSuffix", "εΎ" },
            { "DecadePastPrefix", "" },
            { "DecadePastSuffix", "ε" },
            { "DecadeSingularName", "εΉ΄" },
            { "DecadePluralName", "εΉ΄" },
            { "HourPattern", "%n%u" },
            { "HourFuturePrefix", "δ»γγ" },
            { "HourFutureSuffix", "εΎ" },
            { "HourPastPrefix", "" },
            { "HourPastSuffix", "ε" },
            { "HourSingularName", "ζι" },
            { "HourPluralName", "ζι" },
            { "JustNowPattern", "%u" },
            { "JustNowFuturePrefix", "δ»γγ" },
            { "JustNowFutureSuffix", "γγ" },
            { "JustNowPastPrefix", "" },
            { "JustNowPastSuffix", "γγ£γδ»" },
            { "JustNowSingularName", "" },
            { "JustNowPluralName", "" },
            { "MillenniumPattern", "%n%u" },
            { "MillenniumFuturePrefix", "δ»γγ" },
            { "MillenniumFutureSuffix", "εΎ" },
            { "MillenniumPastPrefix", "" },
            { "MillenniumPastSuffix", "ε" },
            { "MillenniumSingularName", "εΉ΄" },
            { "MillenniumPluralName", "εΉ΄" },
            { "MillisecondPattern", "%n%u" },
            { "MillisecondFuturePrefix", "δ»γγ" },
            { "MillisecondFutureSuffix", "εΎ" },
            { "MillisecondPastPrefix", "" },
            { "MillisecondPastSuffix", "ε" },
            { "MillisecondSingularName", "γγͺη§" },
            { "MillisecondPluralName", "γγͺη§" },
            { "MinutePattern", "%n%u" },
            { "MinuteFuturePrefix", "δ»γγ" },
            { "MinuteFutureSuffix", "εΎ" },
            { "MinutePastPrefix", "" },
            { "MinutePastSuffix", "ε" },
            { "MinuteSingularName", "ε" },
            { "MinutePluralName", "ε" },
            { "MonthPattern", "%n%u" },
            { "MonthFuturePrefix", "δ»γγ" },
            { "MonthFutureSuffix", "εΎ" },
            { "MonthPastPrefix", "" },
            { "MonthPastSuffix", "ε" },
            { "MonthSingularName", "γΆζ" },
            { "MonthPluralName", "γΆζ" },
            { "SecondPattern", "%n%u" },
            { "SecondFuturePrefix", "δ»γγ" },
            { "SecondFutureSuffix", "εΎ" },
            { "SecondPastPrefix", "" },
            { "SecondPastSuffix", "ε" },
            { "SecondSingularName", "η§" },
            { "SecondPluralName", "η§" },
            { "WeekPattern", "%n%u" },
            { "WeekFuturePrefix", "δ»γγ" },
            { "WeekFutureSuffix", "εΎ" },
            { "WeekPastPrefix", "" },
            { "WeekPastSuffix", "ε" },
            { "WeekSingularName", "ι±ι" },
            { "WeekPluralName", "ι±ι" },
            { "YearPattern", "%n%u" },
            { "YearFuturePrefix", "δ»γγ" },
            { "YearFutureSuffix", "εΎ" },
            { "YearPastPrefix", "" },
            { "YearPastSuffix", "ε" },
            { "YearSingularName", "εΉ΄" },
            { "YearPluralName", "εΉ΄" },
            { "AbstractTimeUnitPattern", "" },
            { "AbstractTimeUnitFuturePrefix", "" },
            { "AbstractTimeUnitFutureSuffix", "" },
            { "AbstractTimeUnitPastPrefix", "" },
            { "AbstractTimeUnitPastSuffix", "" },
            { "AbstractTimeUnitSingularName", "" },
            { "AbstractTimeUnitPluralName", "" } };

   @Override
   public Object[][] getContents()
   {
      return OBJECTS;
   }

   private volatile ConcurrentMap<TimeUnit, TimeFormat> formatMap = new ConcurrentHashMap<TimeUnit, TimeFormat>();

   @Override
   public TimeFormat getFormatFor(TimeUnit t)
   {
      if (!formatMap.containsKey(t)) {
         formatMap.putIfAbsent(t, new JaTimeFormat(this, t));
      }
      return formatMap.get(t);
   }

   private static class JaTimeFormat implements TimeFormat
   {

      private static final String NEGATIVE = "-";
      public static final String SIGN = "%s";
      public static final String QUANTITY = "%n";
      public static final String UNIT = "%u";

      private final ResourceBundle bundle;
      private String singularName = "";
      private String pluralName = "";
      private String futureSingularName = "";
      private String futurePluralName = "";
      private String pastSingularName = "";
      private String pastPluralName = "";

      private String pattern = "";
      private String futurePrefix = "";
      private String futureSuffix = "";
      private String pastPrefix = "";
      private String pastSuffix = "";
      private int roundingTolerance = 50;

      public JaTimeFormat(final ResourceBundle bundle, final TimeUnit unit)
      {

         this.bundle = bundle;

         setPattern(bundle.getString(getUnitName(unit) + "Pattern"));
         setFuturePrefix(bundle.getString(getUnitName(unit) + "FuturePrefix"));
         setFutureSuffix(bundle.getString(getUnitName(unit) + "FutureSuffix"));
         setPastPrefix(bundle.getString(getUnitName(unit) + "PastPrefix"));
         setPastSuffix(bundle.getString(getUnitName(unit) + "PastSuffix"));

         setSingularName(bundle.getString(getUnitName(unit) + "SingularName"));
         setPluralName(bundle.getString(getUnitName(unit) + "PluralName"));

         try {
            setFuturePluralName(bundle.getString(getUnitName(unit) + "FuturePluralName"));
         }
         catch (Exception e) {}
         try {
            setFutureSingularName((bundle.getString(getUnitName(unit) + "FutureSingularName")));
         }
         catch (Exception e) {}
         try {
            setPastPluralName((bundle.getString(getUnitName(unit) + "PastPluralName")));
         }
         catch (Exception e) {}
         try {
            setPastSingularName((bundle.getString(getUnitName(unit) + "PastSingularName")));
         }
         catch (Exception e) {}
      }

      private String getUnitName(TimeUnit unit)
      {
         return unit.getClass().getSimpleName();
      }

      @Override
      public String format(final Duration duration)
      {
         return format(duration, true);
      }

      @Override
      public String formatUnrounded(Duration duration)
      {
         return format(duration, false);
      }

      private String format(final Duration duration, final boolean round)
      {
         String sign = getSign(duration);
         String unit = getGramaticallyCorrectName(duration, round);
         long quantity = getQuantity(duration, round);
         if (duration.getUnit() instanceof Decade) quantity *= 10;
         if (duration.getUnit() instanceof Millennium) quantity *= 1000;

         return applyPattern(sign, unit, quantity);
      }

      private String applyPattern(final String sign, final String unit, final long quantity)
      {
         String result = getPattern(quantity).replaceAll(SIGN, sign);
         result = result.replaceAll(QUANTITY, String.valueOf(quantity));
         result = result.replaceAll(UNIT, unit);

         return result;
      }

      protected String getPattern(final long quantity)
      {
         return pattern;
      }

      public String getPattern()
      {
         return pattern;
      }

      protected long getQuantity(Duration duration, boolean round)
      {
         return Math.abs(round ? duration.getQuantityRounded(roundingTolerance) : duration.getQuantity());
      }

      protected String getGramaticallyCorrectName(final Duration d, boolean round)
      {
         String result = getSingularName(d);
         if ((Math.abs(getQuantity(d, round)) == 0) || (Math.abs(getQuantity(d, round)) > 1)) {
            result = getPluralName(d);
         }
         return result;
      }

      private String getSign(final Duration d)
      {
         if (d.getQuantity() < 0) {
            return NEGATIVE;
         }
         return "";
      }

      private String getSingularName(Duration duration)
      {
         if (duration.isInFuture() && futureSingularName != null && futureSingularName.length() > 0) {
            return futureSingularName;
         }
         else if (duration.isInPast() && pastSingularName != null && pastSingularName.length() > 0) {
            return pastSingularName;
         }
         else {
            return singularName;
         }
      }

      private String getPluralName(Duration duration)
      {
         if (duration.isInFuture() && futurePluralName != null && futureSingularName.length() > 0) {
            return futurePluralName;
         }
         else if (duration.isInPast() && pastPluralName != null && pastSingularName.length() > 0) {
            return pastPluralName;
         }
         else {
            return pluralName;
         }
      }

      @Override
      public String decorate(Duration duration, String time)
      {
         StringBuilder result = new StringBuilder();
         if (duration.isInPast()) {
            result.append(pastPrefix).append(time).append(pastSuffix);
         }
         else {
            result.append(futurePrefix).append(time).append(futureSuffix);
         }
         return result.toString().replaceAll("\\s+", " ").trim();
      }

      @Override
      public String decorateUnrounded(Duration duration, String time)
      {
         return decorate(duration, time);
      }

      /*
       * Builder Setters
       */
      public JaTimeFormat setPattern(final String pattern)
      {
         this.pattern = pattern;
         return this;
      }

      public JaTimeFormat setFuturePrefix(final String futurePrefix)
      {
         this.futurePrefix = futurePrefix.trim();
         return this;
      }

      public JaTimeFormat setFutureSuffix(final String futureSuffix)
      {
         this.futureSuffix = futureSuffix.trim();
         return this;
      }

      public JaTimeFormat setPastPrefix(final String pastPrefix)
      {
         this.pastPrefix = pastPrefix.trim();
         return this;
      }

      public JaTimeFormat setPastSuffix(final String pastSuffix)
      {
         this.pastSuffix = pastSuffix.trim();
         return this;
      }

      /**
       * The percentage of the current {@link TimeUnit}.getMillisPerUnit() for which the quantity may be rounded up by
       * one.
       *
       * @param roundingTolerance
       * @return
       */
      public JaTimeFormat setRoundingTolerance(final int roundingTolerance)
      {
         this.roundingTolerance = roundingTolerance;
         return this;
      }

      public JaTimeFormat setSingularName(String name)
      {
         this.singularName = name;
         return this;
      }

      public JaTimeFormat setPluralName(String pluralName)
      {
         this.pluralName = pluralName;
         return this;
      }

      public JaTimeFormat setFutureSingularName(String futureSingularName)
      {
         this.futureSingularName = futureSingularName;
         return this;
      }

      public JaTimeFormat setFuturePluralName(String futurePluralName)
      {
         this.futurePluralName = futurePluralName;
         return this;
      }

      public JaTimeFormat setPastSingularName(String pastSingularName)
      {
         this.pastSingularName = pastSingularName;
         return this;
      }

      public JaTimeFormat setPastPluralName(String pastPluralName)
      {
         this.pastPluralName = pastPluralName;
         return this;
      }

      @Override
      public String toString()
      {
         return "JaTimeFormat [pattern=" + pattern + ", futurePrefix=" + futurePrefix + ", futureSuffix="
                  + futureSuffix + ", pastPrefix=" + pastPrefix + ", pastSuffix=" + pastSuffix +
                  ", roundingTolerance="
                  + roundingTolerance + "]";
      }

   }
}

package edu.njxzc.tcs.util.basicutils;

import java.text.DecimalFormat;

/**
 * Created by Administrator on 15-9-22.
 */
public class NumberUtil {
    /**
     * 数字转换为字符串
     *
     * @param num 数字
     * @return 字符串,如果 num 为空, 返回空字符串
     */
    public static String num2Str(Object num) {
        String str = null;

        if (num == null) {
            str = "";
        } else {
            str = String.valueOf(num);
        }
        return str;
    }

    /**
     * 字符串转换为Integer
     *
     * @param obj 字符串
     * @return Integer, str为null时返回0
     */
    public static Integer getInteger(Object obj) {
        return getInteger(obj, 0);
    }

    /**
     * 字符串转换为Integer
     *
     * @param obj 字符串
     * @return Integer, str为null时返回0
     */
    public static int getINT(Object obj) {
        int temp = 0;
        temp = obj == null ? 0 : Integer.parseInt(obj.toString());
        return temp;
    }

    public static Integer getInteger(int obj) {
        return new Integer(obj);
    }

    /**
     * 字符串转换为Integer
     *
     * @param obj 字符串
     * @param def 默认值
     * @return Integer, 字符串为null时返回def
     */
    public static Integer getInteger(Object obj, int def) {
        String str = obj == null ? "" : obj.toString();

        Integer i = null;

        if (str.trim().length() == 0) {
            i = new Integer(def);
        } else {
            try {
                i = Integer.valueOf(str);
            }
            catch (Exception e) {
            }
        }

        return i == null ? new Integer(def) : i;
    }

    /**
     * 字符串转换为Long
     *
     * @param obj 字符串
     * @return Long, str为null时返回0
     */
    public static Long getLong(Object obj) {
        return getLong(obj, 0);
    }

    public static Long getLong(long obj) {
        return new Long(obj);
    }

    /**
     * 字符串转换为Long
     *
     * @param obj 字符串
     * @param def 默认值
     * @return Long, 字符串为null时返回def
     */
    public static Long getLong(Object obj, long def) {
        String str = obj == null ? "" : obj.toString();

        Long l = null;

        if (str.trim().length() == 0) {
            l = new Long(def);
        } else {
            try {
                l = Long.valueOf(str);
            }
            catch (Exception e) {
            }
        }

        return l == null ? new Long(def) : l;
    }

    /**
     * 字符串转换为Integer
     *
     * @param obj 字符串
     * @return Integer, str为null时返回0
     */
    public static int getIntegerValue(Object obj) {
        return getIntegerValue(obj, 0);
    }

    /**
     * 字符串转换为Integer
     *
     * @param obj 字符串
     * @param def 默认值
     * @return Integer, 字符串为null时返回def
     */
    public static int getIntegerValue(Object obj, int def) {
        return getInteger(obj, def).intValue();
    }

    /**
     * 字符串转换为Long
     *
     * @param obj 字符串
     * @return Long, str为null时返回0
     */
    public static long getLongValue(Object obj) {
        return getLongValue(obj, 0);
    }

    /**
     * 字符串转换为Long
     *
     * @param obj 字符串
     * @param def 默认值
     * @return Long, 字符串为null时返回def
     */
    public static long getLongValue(Object obj, long def) {
        return getLong(obj, def).longValue();
    }

    public static final String[] numStep = {"", "十", "百", "千"};

    public static final String[] numUnit = {"", "万", "亿", "亿"};

    /**
     * 将数字转换为中文
     *
     * @param num
     * @param zero
     * @return
     */
    public static String toZhCN(double num, boolean zero, int definition) {
        String str = "";

        // 格式化数字
        if (definition == 0) {
            str = new DecimalFormat("0").format(num);
        } else {
            str = getFormatNumber(num, definition);
        }

        String[] part = {"", ""};

        if (str.indexOf(".") != -1) {
            part = str.split("\\.");
        } else {
            part[0] = str;
        }

        StringBuffer dest = new StringBuffer("");

        boolean preZero = false; // 前一位是否为0
        boolean zeroUnit = false; // 是否有零单位

        for (int i = part[0].length() - 1, count = 0; i >= 0; i--) {
            int n = Integer.parseInt(part[0].charAt(i) + "");

            if (n == 0) {
                String sn = "";

                if (!preZero) {
                    sn = getCnNum(n, true);
                }

                if (count % 4 == 0) {
                    if (count / 4 > 2) {
                        sn = numUnit[count / 4 % 3 + 1];
                    } else {
                        sn = numUnit[count / 4 % 3];
                    }

                    if (zeroUnit) {
                        for (int j = 0; j < numUnit.length; j++) {
                            if (dest.length() > 0 && (dest.charAt(0) + "").equals(numUnit[j])
                                    && !(dest.charAt(0) + "").equals(sn)) {
                                dest = new StringBuffer(dest.substring(1));
                                break;
                            }
                        }
                    }

                    zeroUnit = true;
                }

                dest.insert(0, sn);

                preZero = true;
            } else {
                String sn = getCnNum(n, zero);

                sn += numStep[count % 4];

                if (n == 1 && count % 4 == 1) {
                    sn = numStep[count % 4];
                }

                if (count % 4 == 0) {
                    if (count / 4 > 1) {
                        sn += numUnit[count / 4 % 3 + 1];
                    } else {
                        sn += numUnit[count / 4 % 3];
                    }

                    zeroUnit = false;
                }

                dest.insert(0, sn);

                preZero = false;
            }

            count++;
        }

        if (part[1].length() > 0) {
            dest.append("点" + getCnNum(Long.parseLong(part[1]), zero));
        }

        // return dest.toString();
        String result = dest.toString();
        // result = result.replaceAll("[零]+", "零");
        return result;
    }

    /**
     * 将数字按位转换为中文，没有进位。
     *
     * @param num
     * @param zero true - 显示汉字 "零", false - 显示符号
     * @return
     */
    public static final String getCnNum(long num, boolean zero) {
        String cn = "";

        char[] c = String.valueOf(num).toCharArray();

        for (int i = 0; i < c.length; i++) {

            switch (c[i]) {
                case 49: {
                    cn += "一";
                    break;
                }
                case 50: {
                    cn += "二";
                    break;
                }
                case 51: {
                    cn += "三";
                    break;
                }
                case 52: {
                    cn += "四";
                    break;
                }
                case 53: {
                    cn += "五";
                    break;
                }
                case 54: {
                    cn += "六";
                    break;
                }
                case 55: {
                    cn += "七";
                    break;
                }
                case 56: {
                    cn += "八";
                    break;
                }
                case 57: {
                    cn += "九";
                    break;
                }
                case 48: {
                    if (!zero) {
                        cn += "○";
                    } else {
                        cn += "零";
                    }
                    break;
                }
            }
        }

        return cn;
    }

    /**
     * 根据参数格式化double型数值到小数点后几位 格式化结果将进行四舍五入处理
     *
     * @param d          double 待格式化的数值
     * @param definition int 格式化到小数点后几位
     * @return String 格式化后得到的数值字符串形式
     */
    public static String getFormatNumber(double d, int definition) {
        /*
         * String str = ""; StringBuffer sb = new StringBuffer("");
         * sb.append("0"); if ( (d + "").indexOf(".") == -1 && definition > 0) {
         * sb.append("."); for (int i = 0; i < definition; i++) {
         * sb.append("0"); } }
         */
        // 2006-10-19 cb 修改
        // String str = "";
        StringBuffer sb = new StringBuffer("");
        sb.append("0.");

        if (definition > 0) {
            for (int i = 0; i < definition; i++) {
                sb.append("0");
            }
        }

        DecimalFormat dft = new DecimalFormat(sb.toString());
        return dft.format(d);
    }
    
  //字符串数组转整型数组
    public static int[] strsToInts(String[] strs){
    	int[] arr=new int[strs.length];
    	for(int i=0; i<strs.length; i++){
    		arr[i] = Integer.parseInt(strs[i]);
    }
    	return arr;
    }
}

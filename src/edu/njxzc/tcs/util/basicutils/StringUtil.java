package edu.njxzc.tcs.util.basicutils;


import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Blob;
import java.sql.Clob;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Vector;

import edu.njxzc.tcs.util.ConstantUtils;

/**
 * Created by Administrator on 15-8-28.
 */
public class StringUtil {
    /**
     * 用户附件上传后，获得的附件名称的转码
     * @param filename
     * @return
     */
    public static String transFileName(String filename){
        if(filename == null || filename.equals("")) return "";
        String beforeTransEncode = StringUtil.strIfNull(ConstantUtils.obj.getSysEnvironment().get("FileBeforeTransEncode"));
        String afterTransEncode = StringUtil.strIfNull(ConstantUtils.obj.getSysEnvironment().get("FileAfterTransEncode"));
        if (beforeTransEncode != null && beforeTransEncode.length() > 0) {
            try {
                return new String(filename.getBytes(beforeTransEncode), afterTransEncode);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return filename;
            }
        }
        return filename;
    }
    /**
     * 截取宽度固定字符串，若字符串宽度大于参数设置，则按照参数截取加上"..."
     *
     * @param string
     *            待截取字符串
     * @param startIndex
     *            截取开始位置
     * @param width
     *            宽度（一个汉字宽度为宽度单位）
     * @return 截取后的字符串
     */

    public static String getWidthFixedStr(String string, int startIndex, int width, boolean htmlStr) {
        if (string == null || string.equals(""))
            return "";
        if (startIndex < 0)
            return "";
        if (width < 0)
            return "";

        char baseChar = ' '; // char = 32
        char topChar = '~'; // char = 126
        char c;
        double tempWidth = 0.0;
        int charIndex = 0;
        string = string.substring(startIndex);
        StringBuffer sb = new StringBuffer();
        String resultStr;

        string = string.replaceAll("&lt;", "<");
        string = string.replaceAll("&gt;", ">");
        string = string.replaceAll("&nbsp;", " ");
        string = string.replaceAll("&quot;", "\"");

        while (charIndex <= string.length() - 1 && tempWidth <= width - 1) {
            c = string.charAt(charIndex);
            if (c >= baseChar && c <= topChar)
                tempWidth += 0.5;
            else
                tempWidth += 1; // 汉字加1
            sb.append(c);
            charIndex++;
        }
        resultStr = sb.toString();
        if (resultStr.length() < string.length()) {
            sb.deleteCharAt(resultStr.length() - 1);
            sb.append("...");
            resultStr = sb.toString();
        }
        if (htmlStr) {
            resultStr = resultStr.replaceAll("<", "&lt;");
            resultStr = resultStr.replaceAll(">", "&gt;");
            resultStr = resultStr.replaceAll(" ", "&nbsp;");
            resultStr = resultStr.replaceAll("\"", "&quot;");
        }
        return resultStr;
    }

    /**
     * 对于字符串为空的判断处理
     *
     * @param src
     *            String 要判断的原始字符串
     * @param defaultValue
     *            String 假如原始字符串为空的时候需要返回的默认字符串，假如该参数为空并且原始字符串为空返回长度为零的字符串
     * @param isTrim
     *            boolean 是否需要截断空格
     * @return String
     * @author huangjiansong
     */
    public String strIfNull(String src, String defaultValue, boolean isTrim) {
        if (src == null)
            src = "";
        if (isTrim)
            src = src.trim();
        if (defaultValue != null && src.length() == 0)
            return defaultValue;
        return src;
    }

    /**
     * 字符串处理
     *
     * @param src
     *            String
     * @return String
     */
    public String strIfNull(String src) {
        if (src == null)
            src = "";

        return src;
    }

    /**
     * 字符串处理
     *
     * @param src
     *            String
     * @return String
     */
    public String strChangeZeroByDouble(String src) {
        if (src == null)
            src = "";

        if (Double.parseDouble(src) == 0) {
            src = "";
        }

        return src;
    }

    public static String getHtmlSpace(String str) {
        if (str.length() == 0) {
            return "&nbsp";
        } else {
            return str;
        }
    }

    /**
     *
     * @param obj
     * @return
     */
    public static final String strIfNull(Object obj) {
        if (obj == null) {
            return "";
        }

        if (obj instanceof String) {
            return (String) obj;
        } else {
            return obj.toString();
        }
    }

    /**
     * 替换字符串中的回车和换行符
     *
     * @author jk
     * @param str
     * @return
     */
    public static final String crToChar(String str) {

        char[] strChar = str.toCharArray();

        // P.p("AssetsMng.main, ArraySize: " + strChar.length);

        for (int c = 0; c < strChar.length; c++) {
            if (strChar[c] == 10 || strChar[c] == 13) {
                char[] strCharTmp = new char[strChar.length + 1];

                int cc = 0;
                for (; cc < c; cc++) {
                    strCharTmp[cc] = strChar[cc];
                }

                //strCharTmp[cc++] = '\\';
                if (strChar[c] == 10) {
                    strCharTmp[cc++] = 'n';
                } else {
                    strCharTmp[cc++] = 'r';
                }

                for (; cc < strChar.length; cc++) {
                    strCharTmp[cc] = strChar[cc - 1];
                }

                strCharTmp[strCharTmp.length - 1] = strChar[strChar.length - 1];
                strChar = strCharTmp;
            }
        }

        return new String(strChar);
    }

    public static String getStringNowTime() {
        return (new SimpleDateFormat(DateUtil.DEFAULT_TIME_PATTERN)).format(new Date());
    }

    public static String getStringNowDate() {
        return (new SimpleDateFormat(DateUtil.DEFAULT_DATE_PATTERN)).format(new Date());
    }

    /**
     * 从Blob中获取字符串
     *
     * @param blob
     *            Blob对象
     * @return 字符串
     */
    public static String fromBlob(Blob blob) {
        if (blob == null) {
            return "";
        }
        // StringBuffer sb = new StringBuffer();
        try {

            byte[] array = new byte[1000];
            InputStream in = blob.getBinaryStream();

            /**
             * hjs 为了修改乱码的问题
             */
            // 保存每次读取的字节列表
            Vector v = new Vector();

            // 保存每次读取的字节长度
            Vector v1 = new Vector();
            int len = in.read(array, 0, 1000);

            // 保存所有字节的长度
            int alllen = 0;
            while (len > 0) {
                alllen = alllen + len;
                v.add(array);
                v1.add(new Integer(len));
                array = new byte[1000];
                len = in.read(array, 0, 1000);
            }
            if (alllen > 0 && v.size() > 0) {
                byte[] arraytemp = new byte[alllen];
                int index = 0;
                for (int i = 0; i < v.size(); i++) {
                    int lentemp = ((Integer) v1.get(i)).intValue();
                    byte[] arraytt = (byte[]) v.get(i);
                    System.arraycopy(arraytt, 0, arraytemp, index, lentemp);
                    index = index + lentemp;
                }

                return new String(arraytemp, ConstantUtils.obj.getSysEnvironment().get("afterTransEncode.get").toString());

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 从clob中获取字符串
     *
     * @param clob
     *            clob对象
     * @return 字符串
     */
    public static String fromClob(Clob clob) {
        if (clob == null) {
            return "";
        }
        String str = "";
        try {
            str = clob != null ? clob.getSubString(1, (int) clob.length()) : null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 把字符串中的回车符转换成指定的字符
     *
     * @param str
     *            字符串
     * @param wrapStr
     *            替换字符串
     * @return 字符串
     */
    public final static String transWrapToString(String str, String wrapStr) {
        StringBuffer sb = new StringBuffer(str);
        int notCheckedLength = sb.length();
        int start = 0;
        int wrapCount = WRAP.length;
        for (int j = 0; j < wrapCount; j++) {
            notCheckedLength = sb.length();
            start = 0;
            while (notCheckedLength > 0) {
                String temp = sb.substring(start);
                int index = temp.indexOf(WRAP[j]);
                if (index == -1) {
                    break;
                }

                notCheckedLength -= (index + WRAP[j].length());
                start += index;
                sb.replace(start, start + WRAP[j].length(), wrapStr);
                start += wrapStr.length();
            }
        }
        return sb.toString();
    }

    /**
     * HTML转义
     *
     * @param str
     * @return
     */
    public static String escape2HTML(String str) {
        return str.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(
                ">", "&gt;").replaceAll("\"", "&quot;")
                .replaceAll("\n", "<BR>").replaceAll("\\s", "&nbsp;");
    }

    public static String getHumanFilesize(long filesize) {

        String s = "";

        if (filesize >= (1024 * 1024 * 1024)) {
            s = Integer.toString(Math.round(filesize / (1024 * 1024 * 1024)
                    * 100) / 100)
                    + "Gb";
        } else if (filesize >= (1024 * 1024)) {
            s = Integer
                    .toString(Math.round(filesize / (1024 * 1024) * 100) / 100)
                    + "Mb";
        } else if (filesize >= 1024) {
            s = Integer.toString(Math.round(filesize / 1024 * 100) / 100)
                    + "Kb";
        } else if (filesize > 0) {
            s = Long.toString(filesize) + "bit";
        } else {
            s = "-";
        }

        return s;
    }

    private final static String WRAP[] = { "\r\n", "\r", "\n" }; // wrap

    public static void main(String[] args) {
        System.out.println(escape2HTML("aaa\nbbbnn"));
    }

    //将全角的汉字换成半角的
    public static String turnTheAlltoTheHalf(String str){
        str = getStr(str);
        str = str.replaceAll("０","0");
        str = str.replaceAll("１","1");
        str = str.replaceAll("２","2");
        str = str.replaceAll("３","3");
        str = str.replaceAll("４","4");
        str = str.replaceAll("５","5");
        str = str.replaceAll("６","6");
        str = str.replaceAll("７","7");
        str = str.replaceAll("８","8");
        str = str.replaceAll("９","9");
        return str;
    }

    /**
     * 获取一个字符串,null转换为空字符串
     *
     * @param src
     *            源对象
     * @return 字符串
     */
    public static String getStr(Object src) {

        return getStr(src, -1);

    }

    public static String getStr(int src) {

        return String.valueOf(src);
    }

    public static String getStr(long src) {

        return String.valueOf(src);

    }

    /**
     * 获取一个一定长度的字符串,null转换为空字符串
     *
     * @param src
     *            源对象
     * @param length
     *            字符串长度
     * @return 字符串
     */
    public static String getStr(Object src, int length) {
        if (src == null) {
            return "";
        }

        if (src instanceof String) {
            return (String) src;
        }

        String value = String.valueOf(src);

        return value.length() > length && length != -1 ? value.substring(0,
                length) : value;

    }

    public static String changeEncoding(String src){
        try {
            String beforeTransEncode = StringUtil.strIfNull(ConstantUtils.obj.getSysEnvironment().get("beforeTransEncode.get"));
            String afterTransEncode = StringUtil.strIfNull(ConstantUtils.obj.getSysEnvironment().get("afterTransEncode.get"));
            if (beforeTransEncode != null && beforeTransEncode.length() > 0) {
                src = new String(src.getBytes(beforeTransEncode),afterTransEncode);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return src;
    }
    
    /**
	 * 判断字符串是否全部由数值组成
	 * 
	 * @param sCheck
	 *            被检测的字符串
	 * @return
	 */
	public final static boolean isNumeric(String sCheck) {
		if (sCheck == null) {
			return false;
		}
		if (sCheck.length() == 0) {
			return false;
		}
		String numStr = "0123456789";
		for (int i = 0; i < sCheck.length(); i++) {
			if (numStr.indexOf(sCheck.charAt(i)) == -1) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 判断字符串是否为空 null/空值/全部由空字符串组成都视为空值
	 * 
	 * @param sCheck
	 *            被检测的字符串
	 * @return
	 */
	public final static boolean isEmpty(String sCheck) {
		return (sCheck == null || replace(sCheck, " ", "").equals(""));
	}

	/**
	 * 判断字符串是否为整数 包括正负
	 * 
	 * @param sCheck
	 *            被检测的字符串
	 * @return
	 */
	public final static boolean isInt(String sCheck) {
		if (isEmpty(sCheck))
			return false;

		if (sCheck.substring(0, 1).equals("-"))
			sCheck = sCheck.substring(1);

		if (!isNumeric(sCheck))
			return false;

		if (Long.parseLong(sCheck) > 2147483647) {
			return false;
		}
		return true;
	}

	/**
	 * 判断字符串是否为实数
	 * 
	 * @param sCheck
	 *            被检测的字符串
	 * @return
	 */
	public final static boolean isFloat(String sCheck) {
		if (isEmpty(sCheck)) {
			return false;
		}
		if (sCheck.indexOf(".") != -1) {
			int dotPos = sCheck.indexOf(".");
			sCheck = sCheck.substring(0, dotPos) + sCheck.substring(dotPos + 1);
		}
		if (!isNumeric(sCheck))
			return false;
		return true;
	}

	/**
	 * 获取字符串，如果传入的字符串为null或空，使用默认值作为返回值
	 * 
	 * @param sCheck
	 *            被检测的字符串
	 * @param sReplace
	 *            如果字符串为空时的替换值
	 * @return
	 */
	public final static String getString(Object obj, String sReplace) {
		if (obj == null) {
			return sReplace;
		}
		String sRet = obj.toString();
		if (sRet.length() == 0) {
			return sReplace;
		}
		return sRet;
	}

	/**
	 * 获取字符串，如果传入的字符串为null或空，返回空值
	 * 
	 * @param sCheck
	 *            被检测的字符串
	 * @return
	 */
	public final static String getString(String sCheck) {
		return getString(sCheck, "");
	}

	/**
	 * 获取整数，如果传入的字符串不是整数数值，使用默认值作为返回值
	 * 
	 * @param sCheck
	 *            被检测的字符串
	 * @param iReplace
	 *            如果字符串为空时的替换数值
	 * @return
	 */
	public final static int getInt(String sCheck, int iReplace) {
		if (!isInt(sCheck))
			return iReplace;
		return Integer.parseInt(sCheck);
	}

	/**
	 * 获取实数，如果传入的字符串不是数值，使用默认值作为返回值
	 * 
	 * @param sCheck
	 *            被检测的字符串
	 * @param nReplace
	 *            如果字符串为空时的替换数值
	 * @return
	 */
	public final static float getFloat(String sCheck, float nReplace) {
		if (!isFloat(sCheck))
			return nReplace;
		return Float.parseFloat(sCheck);
	}

	/**
	 * 将编码不准确的中文字符串转换为可以正常显示的中文输出 目前仅能转换符合iso8859-1编码的字符串到GBK <该方法需要重新修订>
	 * 
	 * @param sOrigin
	 *            被转换的字符串
	 * @return
	 */
	public final static String str2Chs(String sOrigin) {
		byte[] arrayByte;
		try {
			int i = 0;
			arrayByte = sOrigin.getBytes("iso8859-1");
			for (i = 0; i < arrayByte.length; i++)
				if (arrayByte[i] + 0 < 0)
					return new String(arrayByte, "GBK");
			arrayByte = sOrigin.getBytes("GBK");
			for (i = 0; i < arrayByte.length; i++)
				if (arrayByte[i] + 0 < 0)
					return new String(arrayByte, "GBK");
		} catch (Exception e) {
		}
		return sOrigin;
	}

	public final static String number2Chs(int nOrigin, boolean bCaptial) {
		String[] aNumList = { "○", "一", "二", "三", "四", "五", "六", "七", "八", "九" };
		String[] aBigNumList = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌",
				"玖" };
		if (bCaptial) {
			return aBigNumList[nOrigin];
		} else {
			return aNumList[nOrigin];
		}
	}

	/**
	 * 将数值转换为十进制中文，例如:123.45转换为一百二十三点四五
	 * 
	 * @param nVariant
	 * @return
	 */
	public final static String num2Chs(float nVariant) {
		return "";
	}

	/**
	 * 将数值转换为十进制中文表示的货币，例如123.45转换为壹佰贰拾叁圆肆角伍分
	 * 
	 * @param nVariant
	 * @return
	 */
	public final static String currency2Chs(float nVariant) {
		return "";
	}

	/**
	 * 替换字符串中指定的子串
	 * 
	 * @param sOrigin
	 *            被替换的字符串
	 * @param sPattern
	 *            被替换的子串
	 * @param sReplaceBy
	 *            替换后的子串
	 * @return
	 */
	public final static String replace(String sOrigin, String sPattern,
			String sReplaceBy) {
		if (sOrigin == null) {
			return "";
		}
		int s = 0;
		int e = 0;
		StringBuffer sbResult = new StringBuffer();
		while ((e = sOrigin.indexOf(sPattern, s)) >= 0) {
			sbResult.append(sOrigin.substring(s, e));
			sbResult.append(sReplaceBy);
			s = e + sPattern.length();
		}
		sbResult.append(sOrigin.substring(s));
		return sbResult.toString();
	}

	/**
	 * 将字符串分割，返回数组
	 * 
	 * @param str
	 *            待分割的字符串
	 * @param pattern
	 *            分隔符
	 * @return 数组
	 */
	public static String[] split(String str, String pattern) {
		Vector<String> strset = new Vector<String>();
		int s = 0, e = 0;
		while ((e = str.indexOf(pattern, s)) >= 0) {
			strset.addElement(str.substring(s, e));
			s = e + pattern.length();
		}
		if (s != str.length())
			strset.addElement(str.substring(s, str.length()));
		else if (s == 0)
			strset.addElement("");
		else
			strset.addElement("");
		int len = strset.size();
		String result[] = new String[len];
		for (int i = 0; i < len; i++)
			result[i] = (String) strset.elementAt(i);
		return result;
	}

	/**
	 * 使用指定的字符填充在字符串的左面
	 * 
	 * @param sOrigin
	 *            未填充的字符串
	 * @param sRepeat
	 *            指定填充的字符串
	 * @param nLen
	 *            最终返回字符串的长度
	 * @return
	 */
	public final static String lpad(String sOrigin, String sRepeat, int nLen) {
		sOrigin = getString(sOrigin);
		if (sOrigin.length() >= nLen)
			return sOrigin;
		for (int i = 0; i < nLen - sOrigin.length(); i++) {
			sOrigin = sRepeat + sOrigin;
		}
		return sOrigin;
	}

	/**
	 * 使用指定的字符填充在字符串的右面
	 * 
	 * @param sOrigin
	 *            未填充的字符串
	 * @param sRepeat
	 *            指定填充的字符串
	 * @param nLen
	 *            最终返回字符串的长度
	 * @return
	 */
	public final static String rpad(String sOrigin, String sRepeat, int nLen) {
		sOrigin = getString(sOrigin);
		if (sOrigin.length() >= nLen)
			return sOrigin;
		for (int i = 0; i < nLen - sOrigin.length(); i++) {
			sOrigin += sRepeat;
		}
		return sOrigin;
	}

	/**
	 * 去除字符串两边的空格
	 * 
	 * @param sOrigin
	 *            原始字符串
	 * @return
	 */
	public final static String trim(String sOrigin) {
		if (sOrigin == null) {
			return null;
		}
		return sOrigin.trim();
	}

	/**
	 * 返回字符串左面定长的字符串
	 * 
	 * @param sOrigin
	 *            原始字符串
	 * @param iLen
	 *            需要返回的长度
	 * @return
	 */
	public static String left(String sOrigin, int iLen) {
		sOrigin = getString(sOrigin);
		if (isEmpty(sOrigin))
			return "";
		if (sOrigin.length() <= iLen)
			return sOrigin;
		return sOrigin.substring(0, iLen);
	}

	/**
	 * 返回字符串右面定长的字符串
	 * 
	 * @param sOrigin
	 *            原始字符串
	 * @param iLen
	 *            需要返回的长度
	 * @return
	 */
	public static String right(String sOrigin, int iLen) {
		sOrigin = getString(sOrigin);
		if (isEmpty(sOrigin))
			return "";
		if (sOrigin.length() <= iLen)
			return sOrigin;
		return sOrigin.substring(sOrigin.length() - iLen);
	}

	/**
	 * 返回定长的字符串 中文长度为2
	 * 
	 * @param sVariant
	 * @param iLen
	 * @return
	 */
	public static String getLenStr(String sVariant, int iLen) {
		if (sVariant == null || sVariant.length() == 0) {
			return "";
		}
		if (iLen < 0) {
			return "";
		}
		if (sVariant.length() > iLen) {
			return sVariant.substring(0, iLen);
		} else {
			return sVariant;
		}
	}

	/**
	 * 返回定长的字符串,并添加后缀 中文长度为2，长度包括后缀长度
	 * 
	 * @param sVariant
	 * @param iLen
	 * @param sSuffix
	 * @return
	 */
	public static String getLenStr(String sVariant, int iLen, String sSuffix) {
		return "";
	}

	/**
	 * 检测用指定分隔符分隔的字符串中有没有某个子串
	 */
	public static boolean foundStr(String sParent, String sChild,
			String sSeprator) {
		return ((sSeprator + sParent + sSeprator).indexOf(sSeprator + sChild
				+ sSeprator) != -1);
	}

	/**
	 * 检测用指定分隔符","分隔的字符串中有没有某个子串
	 */
	public static boolean foundStr(String sParent, String sChild) {
		return foundStr(sParent, sChild, ",");
	}

	/**
	 * 将字符串转换为%uABCD的格式，同javaScript的escape函数。
	 */
	public final static String escape(String str) {
		String stmp = "";

		for (int i = 0; i < str.length(); i++) {
			int c = (int) str.charAt(i);
			if (c < 128) {
				String s = Integer.toString(c, 16);
				while (s.length() < 2) {
					s = "0" + s;
				}
				stmp += "%" + s;
			} else {
				String s = Integer.toString(c, 16);
				while (s.length() < 4) {
					s = "0" + s;
				}
				stmp += "%u" + s;
			}
		}
		return stmp;
	}

	/**
	 * 同javascript里的unescape函数
	 * 
	 * @param s
	 * @return
	 */
	public final static String unescape(String s) {
		String stmp = "";
		for (int i = 0; i < s.length(); i++) {
			String c = s.substring(i, i + 1);
			if (c.equals("%")) {
				if (i < s.length() - 1) {
					String c2 = s.substring(i + 1, i + 2);
					if (c2.equalsIgnoreCase("u")) {
						String sHex = s.substring(i + 2, i + 6);
						stmp += (char) Integer.parseInt(sHex, 16);
						i += 5;
					} else {
						String sHex = s.substring(i + 1, i + 3);
						stmp += (char) Integer.parseInt(sHex, 16);
						i += 2;
					}
				} else {
					stmp += "%";
				}
			} else {
				stmp += c;
			}
		}

		return stmp;
	}

	public static String getDivideValue(String sNum1, String sNum2, int nDotNum) {
		try {
			double nNum1 = Double.parseDouble(sNum1);
			double nNum2 = Double.parseDouble(sNum2);
			double nDivideValue = nNum1 / nNum2;
			String sDivideValue = nDivideValue + "";
			if (sDivideValue.indexOf("E") > 0) {
				String sTmp = sDivideValue.substring(
						sDivideValue.indexOf("E") + 2, sDivideValue.length());
				sDivideValue = sDivideValue.substring(0,
						sDivideValue.indexOf("E"));
				sDivideValue = replace(sDivideValue, ".", "");
				for (int i = 1; i <= Integer.parseInt(sTmp); i++) {
					if (i == Integer.parseInt(sTmp)) {
						sDivideValue = "0." + sDivideValue;
					} else {
						sDivideValue = "0" + sDivideValue;
					}
				}
			}
			if (sDivideValue.indexOf(".") + 1 + nDotNum <= sDivideValue
					.length() - 1) {
				return sDivideValue.substring(0, sDivideValue.indexOf(".") + 1
						+ nDotNum);
			} else {
				return sDivideValue;
			}
		} catch (Exception e) {
			return null;
		}
	}

	public static String getPhysicalSize(String sSizeOfByte, int nDotNum) {
		String sSizeOfKB = getDivideValue(sSizeOfByte, "1024", nDotNum);
		if (sSizeOfKB != null) {
			if (sSizeOfKB.indexOf(".") >= 4) {
				int nTmp = 1024 * 1024;
				return getDivideValue(sSizeOfByte, String.valueOf(nTmp),
						nDotNum) + "MB";
			} else {
				return sSizeOfKB + "KB";
			}
		} else {
			return null;
		}
	}

	public final static String HTMLEncode(String str) {
		String sReturn = "";
		sReturn = replace(str, "&", "&amp;");
		sReturn = replace(sReturn, "<", "&lt;");
		sReturn = replace(sReturn, ">", "&gt;");
		sReturn = replace(sReturn, "\"", "&quot;");
		return sReturn;

	}

	/**
	 * 将英文字符转换为简体中文，如果输入的就是中文，则不会作改变
	 * 
	 * @param s
	 *            英文字符
	 * @return 转换后的字符
	 */
	public final static String toChinese(String s) {
		try {

			byte abyte0[] = s.getBytes("iso8859-1");
			for (int i = 0; i < abyte0.length; i++)
				if (abyte0[i] + 0 < 0)
					return new String(abyte0, "GBK");

			abyte0 = s.getBytes("GBK");
			for (int j = 0; j < abyte0.length; j++)
				if (abyte0[j] + 0 < 0)
					return new String(abyte0, "GBK");

		} catch (Exception exception) {
		}
		return s;
	}

	public final static boolean isDouble(String str) {
		try {
			Double.parseDouble(str);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * 将null转换为空字符串，不是null的字符串将截去头尾的空格
	 * 
	 * @param s
	 * @return
	 */
	public final static String chgNullToAEmptyStr(String s) {
		if (s == null)
			s = "";
		return s.trim();
	}
	

	/**
	 * 计算字符串中第一数字出现的位置
	 * @param str
	 * @return
	 */
	public static int NumericPosition(String str){
		  for (int i = 0; i < str.length(); i++){
		   if (Character.isDigit(str.charAt(i))){
		    return i;
		   }
		  }
		  return 0;
		 }

	/**
	 * 判断字符串是否包含数字的方法
	 * @param str
	 * @return
	 */
	public static boolean myIsNumeric(String str){
		  for (int i = 0; i < str.length(); i++){
		   if (Character.isDigit(str.charAt(i))){
		    return true;
		   }
		  }
		  return false;
		 }
	
	/**
	 * wxz 2014-9-20 添加
	 * 生成时间+随机数的文件名
	 * @return
	 */
	//用当前时间+N位随机数
	public static String generateFileName() {
		// 获得当前时间
		DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		// 转换为字符串
		String formatDate = format.format(new Date());
		// 随机生成文件编号
		int random = new Random().nextInt(10000);
		return new StringBuffer().append(formatDate).append(random).toString();
	}
}

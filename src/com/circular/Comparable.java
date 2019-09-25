package com.circular;

/**
 * 图形比较面积的接口
 * 
 * @author mopeiwen
 * @version 2019年9月25日 下午6:31:48
 */
public interface Comparable {
	/**
	 * 和另一个图形比较面积
	 * @param graphical 图形类
	 * @return 返回1、0、-1(大于为1，相等为0，小于为-1)
	 */
	public int compareTo(Graphical graphical);

}

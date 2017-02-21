/**
 * @ProjectName: 金融业务平台软件
 * @Copyright: 2010 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017年2月21日 下午2:37:50
 * @Description: 本内容仅限于杭州海康威视数字技术系统公司内部使用，禁止转发.
 */
package com.mxm.learn.arithmetic.problem1;

import java.util.Arrays;

/**
 * <p>
 * 	输入二叉树的前序遍历和中序遍历的结果，重建出该二叉树。假设前序遍历和中序遍历结果中都不包含重复的数字，
 * 	例如输入的前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
 * 	重建出如图所示的二叉树。
 * </p>
 * @author maxianming 2017年2月21日 下午2:37:50
 * @version V1.0
 */
public class Problem {
	public static void main(String[] args) throws Exception {
		int[] preSort = {1,2,4,7,3,5,6,8};
		int[] inSort = {4,7,2,1,5,3,8,6};
		BinaryTreeNode root = constructCore(preSort,inSort);
	}

	private static BinaryTreeNode constructCore(int[] preSort, int[] inSort) throws Exception {
		if (preSort == null || inSort == null) {
			return null;
		}
		if (preSort.length != inSort.length) {
			throw new Exception("输出的长度不一致");
		}
		
		BinaryTreeNode root = new BinaryTreeNode();
		
		for (int i = 0; i < inSort.length; i++) {
			if (inSort[i] == preSort[0]) {
				root.value = inSort[i];
				System.out.println(root.value);
				root.leftNode = constructCore(Arrays.copyOfRange(preSort,1, i+1),Arrays.copyOfRange(inSort, 0, i));
				root.rightNode = constructCore(Arrays.copyOfRange(preSort,i+1, preSort.length),Arrays.copyOfRange(inSort, i+1, inSort.length));
			}
		}
		return root;
	}
}

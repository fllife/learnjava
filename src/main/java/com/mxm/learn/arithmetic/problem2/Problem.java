/**
 * @ProjectName: 金融业务平台软件
 * @Copyright: 2010 HangZhou Hikvision System Technology Co., Ltd. All Right Reserved.
 * @address: http://www.hikvision.com
 * @date: 2017年2月21日 下午3:06:49
 * @Description: 本内容仅限于杭州海康威视数字技术系统公司内部使用，禁止转发.
 */
package com.mxm.learn.arithmetic.problem2;

import java.util.Stack;

/**
 * <p>
 * 	用两个栈实现一个队列，实现对了的两个函数appendTail和deleteHead，
 *  分别完成在队列尾插入结点和在队列头部删除结点的功能
 * </p>
 * @author maxianming 2017年2月21日 下午3:06:49
 * @version V1.0
 */
public class Problem<T> {
   private Stack<T> insertStack = new Stack<T>();
   private Stack<T> deleteStack = new Stack<T>();
   
   public void appendTail(T t) {
	   insertStack.push(t);
   }
   
   public T deleteHead() throws Exception {
	   if (deleteStack.isEmpty()) {
		   while (!insertStack.isEmpty()) {
			   deleteStack.push(insertStack.pop());
		   }
	   }
	   if (deleteStack.isEmpty()) {
		   throw new Exception("队列为空，不能删除");
	   }
	   return deleteStack.pop();
   }
}

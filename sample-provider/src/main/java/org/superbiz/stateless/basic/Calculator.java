package org.superbiz.stateless.basic;

import javax.ejb.Remote;

@Remote
public interface Calculator {
	public int add(int a,int b);
	public int subtract(int a,int b);
	public int remainder(int a,int b);
	public int divide(int a,int b);
}

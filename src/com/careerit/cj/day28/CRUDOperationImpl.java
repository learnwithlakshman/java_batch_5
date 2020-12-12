package com.careerit.cj.day28;

import java.util.Arrays;

public class CRUDOperationImpl implements CRUDOperation {

	private String[] names;
	private int count = 0;

	public CRUDOperationImpl() {
		names = new String[3];
	}

	@Override
	public void add(String name) {

		if (count == names.length - 1) {
			String[] temp = new String[names.length + 3];
			System.arraycopy(names, 0, temp, 0, names.length);
			names = temp;
		}
		names[count++] = name;
	}

	@Override
	public boolean remove(String name) {
		
		int index = -1;
		for (int i = 0; i < count; i++) {
			if (names[i].equals(name)) {
				index = i;
				break;
			}
		}
	
		if (index != -1) {
			System.out.println(name);
			if(index == 0 ) {
				String[] temp = new String[names.length-1];
				if(count==1) {
					temp = new String[names.length-1];
				}
				else
					System.arraycopy(names, 1, temp, 0,names.length-1);
				names = temp;
			}else {
				String[] temp = new String[names.length-1];
				System.arraycopy(names, 0, temp, 0, index);
			
				System.arraycopy(names, index+1 , temp, index,count-index);
		
				names = temp;
			}
			count--;
			return true;
		}

		return false;
	}

	@Override
	public void update(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String st = "";
		if (count == 0) {
			return sb.append("[]").toString();
		} else {
			sb.append("[");
			for (int i = 0; i < count; i++) {
				sb.append(names[i] + ", ");
			}
			st = "CRUDOperationImpl [ names: " + sb.substring(0, sb.length() - 2) + "]]";

		}
		return st;
	}

}

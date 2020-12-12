package com.careerit.cj.day28;

public interface CRUDOperation{

			public void add(String name);
			public boolean remove(String name);
			public void update(String name);
			public String[]	getAll();
			public String get(int index);
			public String search(String name);
}

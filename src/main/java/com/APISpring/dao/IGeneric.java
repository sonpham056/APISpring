package com.APISpring.dao;

import java.util.List;

public interface IGeneric<T> {
	@SuppressWarnings("hiding")
	<T> T save(T saver);
	@SuppressWarnings("hiding")
	<T> T update(T updater);
	@SuppressWarnings("hiding")
	<T> int delete(T deleter);
	@SuppressWarnings("hiding")
	<T> T get(String className, String id);
	@SuppressWarnings("hiding")
	<T> List<T> getAll();
}

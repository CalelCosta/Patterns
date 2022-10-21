package br.com.code.factory.app.dbadapter.db;

public interface DB {
	void query(String sql);
	void update(String sql);
}

package util;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 * 
 */
public class Result extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	
	public Result() {
		put("ret", 1);
	}
	
	public static Result error() {
		return error(-1, "未知异常，请联系管理员");
	}
	
	public static Result error(String msg) {
		return error(-1, msg);
	}
	
	public static Result error(int code, String msg) {
		Result r = new Result();
		r.put("ret", code);
		r.put("msg", msg);
		return r;
	}

	public static Result ok(String msg) {
		Result r = new Result();
		r.put("msg", msg);
		return r;
	}
	
	public static Result ok(Map<String, Object> map) {
		Result r = new Result();
		r.putAll(map);
		return r;
	}
	
	public static Result ok() {
		return new Result();
	}

	public Result put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}

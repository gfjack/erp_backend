package com.kdwz.erp.constant;

public class Constant {

    public static final String TOKEN_START = "token_";

    public static final String AUTHORIZATION = "Authorization";

    public static String TITLE = "KDWZ";

    /**
     * 1小时
     */
    public static final long TOKEN_EXPIRED_TIME = System.currentTimeMillis() + 1000 * 60 * 60;

    public static final String USERNAME_PASSWORD_ERROR = "用户名或密码错误";

    public static final String LOGIN_REQUIRED = "请先登录";

    public static final String INVALID_TOKEN = "登录token无效, 请重新登陆";

    public static final String EXPIRED_TOKEN = "登陆时间过期, 请重新登录页";

    /**
     * 可以无权访问的接口, 登陆验证接口
     */
    public static String ALLOWED_PATH = "/v2/authenticate";
}

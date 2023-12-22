package com.telecommunications.utils;

import io.jsonwebtoken.*;

import java.util.Date;
import java.util.UUID;

public class JwtUtil {
//    private static final long time = 1000 * 60 * 60;
    private static final long time = 1000 * 15;
    private static final String sign = "admin";

    public static String createToken() {
        // 创建一个JwtBuilder对象
        //使用JWT自带的构造器构造一个jwt
        JwtBuilder builder = Jwts.builder();
        //使用构造器里的方法封装属性
        String jwtToken = builder.
                //封装header属性
                        setHeaderParam("typ", "JWT").
                setHeaderParam("alg", "HS256")
                //封装payload里的信息 使用claim方法
                .claim("username", "zhangsan")
                .claim("userType", "admin")
                //在payLoad中设置一个超时时间  秒   分 时
                .setSubject("admin-test")
                .setExpiration(new Date(System.currentTimeMillis() + time))
                .setId(UUID.randomUUID().toString())
                //构造signature部分
                .signWith(SignatureAlgorithm.HS256, sign)
                //构造我们的签名 调用compact方法
                .compact();
        System.out.println(jwtToken);

        return jwtToken;
    }

    public static boolean checkToken(String token) {
        if (token == null || token.isEmpty()) {
            return false; //false表示过期
        }
        try {
            Jws<Claims> claimsJws = Jwts.parser().setSigningKey(sign).parseClaimsJws(token);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}

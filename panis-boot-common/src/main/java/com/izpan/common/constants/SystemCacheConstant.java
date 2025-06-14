package com.izpan.common.constants;

import com.izpan.common.pool.StringPools;

import java.io.Serial;
import java.io.Serializable;

/**
 * 系统管理缓存常量
 *
 * @Author payne.zhuang <paynezhuang@gmail.com>
 * @ProjectName panis-boot
 * @ClassName com.izpan.common.constants.SystemCacheConstant
 * @CreateTime 2023/7/18 - 13:45
 */
public class SystemCacheConstant implements Serializable {

    @Serial
    private static final long serialVersionUID = 5416352129963529591L;

    private SystemCacheConstant() {

    }

    private static final String SYSTEM = "system";

    // ====================== 用户管理 Begin ======================

    private static final String USER = "user";

    private static final String LOGIN = "login";

    private static final String REFRESH_TOKEN = "refresh_token";

    // 用户路由
    public static final String SYSTEM_USER_ROUTE = SYSTEM + ":user:route";

    // 统一前缀
    private static final String USER_PREFIX = SYSTEM + StringPools.COLON + USER + StringPools.COLON;

    /**
     * 获取登录用户缓存key
     *
     * @param userId 用户 ID
     * @return {@link String} system:user:login:userId
     * @author payne.zhuang
     * @CreateTime 2023-07-18 13:48
     */
    public static String userLoginKey(Long userId) {
        return USER_PREFIX + LOGIN + StringPools.COLON + userId;
    }

    /**
     * 用户登录记录缓存 Key
     *
     * @param userId 用户 ID
     * @param token  access token or refresh token
     * @return {@link String} system:user:login:userId:token
     * @author payne.zhuang
     * @CreateTime 2024-01-25 11:01
     */
    public static String userLoginTokenKey(Long userId, String token) {
        return userLoginKey(userId) + StringPools.COLON + token;
    }

    /**
     * 获取刷新token缓存Key
     *
     * @param nonce 随机数
     * @return {@link String} system:refresh_token:nonce
     * @author payne.zhuang
     * @CreateTime 2023-08-15 15:10
     */
    public static String userRefreshTokenNonceKey(String nonce) {
        return USER_PREFIX + REFRESH_TOKEN + StringPools.COLON + nonce;
    }

    /**
     * 用户路由缓存 Key
     *
     * @param userId 用户 ID
     * @return {@linkplain String} system:user:route::userId
     * @author payne.zhuang
     * @CreateTime 2024-04-22 09:25
     */
    public static String userRouteKey(Long userId) {
        return SYSTEM_USER_ROUTE + StringPools.DOUBLE_COLON + userId;
    }

    // ====================== 用户管理 End ======================

    // ====================== 角色权限 Begin ======================

    public static final String SYSTEM_ROLE_PERMISSION_LIST = SYSTEM + ":role:permission:list";
    public static final String SYSTEM_ROLE_MENU_LIST = SYSTEM + ":role:menu:list";
    public static final String SYSTEM_ROLE_PERMISSION_RESOURCES = SYSTEM + ":role:permission:resources";

    /**
     * 角色权限列表缓存 Key
     *
     * @param roleId 角色 ID
     * @return {@linkplain String} system:role:permission:list:roleId
     * @author payne.zhuang
     * @CreateTime 2024-04-20 20:59
     */
    public static String rolePermissionListKey(Long roleId) {
        return SYSTEM_ROLE_PERMISSION_LIST + StringPools.DOUBLE_COLON + roleId;
    }

    /**
     * 角色权限资源缓存 Key
     *
     * @param roleId 角色 ID
     * @return {@linkplain String} system:role:permission:resources:roleId
     * @author payne.zhuang
     * @CreateTime 2024-04-20 20:59
     */
    public static String rolePermissionResourcesKey(Long roleId) {
        return SYSTEM_ROLE_PERMISSION_RESOURCES + StringPools.DOUBLE_COLON + roleId;
    }

    /**
     * 角色菜单列表缓存 Key
     *
     * @param roleId 角色 ID
     * @return {@linkplain String} system:role:menu:list:roleId
     * @author payne.zhuang
     * @CreateTime 2024-04-20 20:59
     */
    public static String roleMenuListKey(Long roleId) {
        return SYSTEM_ROLE_MENU_LIST + StringPools.DOUBLE_COLON + roleId;
    }

    // ====================== 角色权限 End ======================

    // ====================== 数据字典 Begin ======================

    public static final String SYSTEM_DICT_ITEM = "system:dict:item";

    /**
     * 数据字典 Item 缓存 Key
     *
     * @return {@link String } system:dict:item:dictCode
     * @author payne.zhuang
     * @CreateTime 2025-04-05 16:48:26
     */
    public static String dictItemKey(String dictCode) {
        return SYSTEM_DICT_ITEM + StringPools.DOUBLE_COLON + dictCode;
    }

    // ====================== 数据字典 End ======================

    // ====================== Controller 注解 Begin ======================

    private static final String ANNOTATION = "annotation";

    private static final String PERMISSION = "permission";

    /**
     * Controller 注解权限缓存 Key
     *
     * @return {@link String } system:annotation:permission
     * @author payne.zhuang
     * @CreateTime 2024-11-06 - 11:56:51
     */
    public static String controllerAnnotationPermissionKey() {
        return SYSTEM + StringPools.COLON + ANNOTATION + StringPools.COLON + PERMISSION;
    }

    // ====================== Controller 注解 End ======================

    // ====================== 数据权限 注解 Begin ======================

    public static final String SYSTEM_DATA_SCOPE = SYSTEM + ":data:scope";

    /**
     * 数据权限缓存 Key
     *
     * @return {@link String } system:data:scope:permissionCode
     * @author payne.zhuang
     * @CreateTime 2025-05-12 15:14:45
     */
    public static String dataScopeKey(String permissionCode) {
        return SYSTEM_DATA_SCOPE + StringPools.DOUBLE_COLON + permissionCode;
    }

    // ====================== 数据权限 注解 End ======================

}

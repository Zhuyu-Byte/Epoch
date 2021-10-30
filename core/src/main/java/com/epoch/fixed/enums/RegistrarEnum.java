package com.epoch.fixed.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Registrar Delegate enums
 *
 * @author zhuyu
 * @since 2021/10/29 15:04
 */
@Getter
@AllArgsConstructor
public enum RegistrarEnum {

    defaults(0, "defaults", "nothing"),
    auth(1, "auth", "user login/register/role and many more");

    final Integer code;

    final String value;

    final String describe;
}

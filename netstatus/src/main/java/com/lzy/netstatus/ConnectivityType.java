package com.lzy.netstatus;

/**
 * 类描述：网络状态类型的枚举类
 * 作者：lzy on 2015/3/14
 */
public enum ConnectivityType {
    UNKNOWN("未知网络"), MOBILE("移动蜂窝网络"), WIFI("wifi网络"), OFFLINE("网络连接已断开");
    private String type;

    ConnectivityType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static ConnectivityType getStatusByType(String type) {
        try {
            for (ConnectivityType connectivityType : values()) {
                if (connectivityType.type.equals(type)) {
                    return connectivityType;
                }
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return type;
    }
}

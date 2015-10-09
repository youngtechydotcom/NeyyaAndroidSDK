package com.finrobotics.neyyasdk.core.packet;

/**
 * Created by zac on 03/10/15.
 */
public class PacketFields {
    public static final byte COMMAND_SYSTEM_CHANGE_NAME = 0x00;
    public static final byte COMMAND_GESTURE_DATA = 0x01;
    public static final byte PARAMETER_SWIPE_DATA = 0x01;
    public static final byte PARAMETER_CHANGE_NAME = 0x04;
    public static byte ACK_REQUIRED = 0x01;
    public static byte ACK_NOT_REQUIRED = 0x0f;
}

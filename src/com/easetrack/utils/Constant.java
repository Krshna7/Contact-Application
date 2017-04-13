package com.easetrack.utils;

public class Constant {
	public static final int TOKEN_EXPIRY_DURATION = 600000; // in milliseconds

	public static final int USER_ROLE_SUPER_ADMIN = 1;
	public static final int USER_ROLE_PRINCIPAL = 2;
	public static final int USER_ROLE_PARENTS = 3;
	public static final int USER_ROLE_TEACHER = 4;
	public static final int USER_ROLE_STUDENT = 5;

	public static final int PERMISSION_NO_RIGHT = 0;
	public static final int PERMISSION_READ = 1;
	public static final int PERMISSION_WRITE = 2;
	public static final int PERMISSION_DELETE = 3;

	public static final int RIGHT_STUDENT = 1;
	public static final int RIGHT_MARKS = 2;
	public static final int RIGHT_ATTENDANCE = 3;
	public static final int RIGHT_CHILDREN = 4;
	public static final int RIGHT_TEACHERS = 5;
	public static final int RIGHT_SUBJECTS = 6;
	public static final int RIGHT_CLASSES = 7;
	public static final int RIGHT_PRINCIPLE = 8;

	public static final int SUCCESS = 200;
	public static final int INVALID_PARAM = 500;
	public static final int UNKNOWN_ERROR = 300;
	public static final int LOGIN_FAILED = 501;
	public static final int INVALID_TOKEN = 502;
	public static final int INSUFFICIENT_RIGHTS = 503;
	public static final int ACCESS_DENIED = 504;

	public static final String INVALID_PARAM_MESSAGE = "Invalid input values.";
	public static final String UNKNOWN_ERROR_MESSAGE = "Unknown Error";
	public static final String LOGIN_FAILED_MESSAGE = "Login Failed.";
	public static final String INVALID_TOKEN_MESSAGE = "Token is invalid";
	public static final String INSUFFICIENT_RIGHTS_MESSAGE = "Insufficient rights";
	public static final String ACCESS_DENIED_MESSGE = "User doesn't have sufficient access to the required entity";

	public static final Integer APPROVED = 0;
	
	
	public static final int MEETING_REQUEST_STATUS_PENDING = 0;
	public static final int MEETING_REQUEST_STATUS_REJECTED = 1;
	public static final int MEETING_REQUEST_STATUS_APPROVED = 2;
	
	public static final int MEETING_SLOT_STATUS_OPEN = 0;
	public static final int MEETING_SLOT_STATUS_CLOSED = 1;
	
}

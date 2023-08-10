package com.epic.atemlogin.util.varlist;

/**
 *
 * Document : MessageVarList Created on : Apr 18, 2013, 9:39:01 AM Author :
 * Isuru Ranasinghe
 */
public class MessageVarList {
    //--------------------Common Messages---------------//

    public static final String COMMON_ERROR_ASSIGN = "Error occurred while assigning";
    public static final String COMMON_ERROR_INSERT = "Error occurred while adding";
    public static final String COMMON_ERROR_UPDATE = "Error occurred while updating";
    public static final String COMMON_ERROR_DELETE = "Error occurred while deleting";
    public static final String COMMON_ERROR_DOWNLOADING = "Error occurred while downloading";
    public static final String COMMON_ERROR_UPLOADING = "Error occurred while uploading";
    public static final String COMMON_ERROR_PROCESS = "Error occurred while processing";
    public static final String COMMON_ERROR_PWRESET = "Error occurred while password reseting";
    public static final String COMMON_ERROR_ACT_DEC = "Error occurred while user activation/deactivation";
    public static final String COMMON_ERROR_CONFIRM = "Error occurred while confirming";
    public static final String COMMON_ERROR_REJECT = "Error occurred while rejecting";
    public static final String COMMON_ALREADY_EXISTS = "Record already exists";
    public static final String COMMON_NOT_EXISTS = "Record doesn't exist.";
    public static final String COMMON_LOGIN_FLAG = "Login Flag Updated.";
    public static final String COMMON_SUCC_INSERT = "created successfully.";
    public static final String COMMON_SUCC_UPDATE = "updated successfully.";
    public static final String COMMON_SUCC_DELETE = "deleted successfully.";
    public static final String COMMON_SUCC_ASSIGN = "assigned successfully.";
    public static final String COMMON_SUCC_DOWNLOAD = "downloaded successfully";
    public static final String COMMON_SUCC_PWRESET = "password reset successfully.";
    public static final String COMMON_SUCC_CONFIRM = "confirmed successfully.";
    public static final String COMMON_SUCC_REJECT = "rejected successfully.";
    public static final String COMMON_ERROR_INPUTFIELDS = "Invalid inputs found while processing data. Input field lengths or types may invalid.";
    public static final String COMMON_ERROR_GET_DATA = "Retrieving or saving data from database failed. Contact administrator.";
    public static final String COMMON_ERROR_ALRADY_USE = "This record is already in use. Cannot delete";
    public static final String COMMON_SUCC_SETTLE = "settled successfully.";
    public static final String COMMON_SUCC_CANCEL = "canceled successfully.";
    public static final String COMMON_ERROR_SETTLE = "Error occurred while settling";
    public static final String COMMON_ERROR_CANCEL = "Error occurred while cancelling";
    public static final String COMMON_SUCC_TEMP_INSERT = "requested to be created.";
    public static final String COMMON_SUCC_TEMP_UPDATE = "requested to be updated.";
    public static final String COMMON_SUCC_TEMP_DELETE = "requested to be deleted.";
    public static final String COMMON_SUCC_TEMP_PWRESET = "password requested to be changed.";
    public static final String COMMON_SUCC_TEMP_ACTIVATED = "requested to be activated.";
    public static final String COMMON_SUCC_ACTIVATED = "activated successfully.";
    public static final String COMMON_SUCC_TEMP_DEACTIVATED = "requested to be deactivated.";
    public static final String COMMON_SUCC_DEACTIVATED = "deactivated successfully.";
    public static final String COMMON_SUCC_TEMP_SETTLE = "requested to be settled.";
    public static final String COMMON_SUCC_TEMP_CANCEL = "requested to be canceled.";
    public static final String COMMON_SUCC_TEMP_ASSIGN = "requested to be assigned.";
    public static final String COMMON_ALREADY_BRANCH_ASSIGN_REQUESTED = "Branch(s) requested to be assigned.";
    public static final String COMMON_ALREADY_PAGETASK_ASSIGN_REQUESTED = "Task(s) requested to be assigned.";
    public static final String COMMON_ALREADY_SECTIONPAGE_ASSIGN_REQUESTED = "Page(s) requested to be assigned.";
    public static final String COMMON_ALREADY_TRANSACTIONTYPE_ASSIGN_REQUESTED = "transaction type(s) requested to be assigned.";
    public static final String COMMON_ALREADY_REQUEST_EXIST = "Request already exist for the given";
    public static final String COMMON_SUCC_TEMP_SIGNOFF = "requested to be manually sign off.";
    public static final String COMMON_SUCC_MANUALLY_SIGNOFF = "manually sign off successfully.";
    public static final String COMMON_ALREADY_SIGNOFF = "already signoff.";
    public static final String COMMON_BATCH_ALREADY_SIGNOFF = "Batch already signoff.";
    public static final String COMMON_ERROR_RESPONSE_DEFAULT = "Undefined response error.";
    public static final String COMMON_ERROR_ESWITCH = "Cannot connect with the eswitch.";
    //--------------------Common Messages---------------//
    //--------------------Section Management---------------// 
    public static final String SEC_MGT_EMPTY_SEC_CODE = "Enter section code.";
    public static final String SEC_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String SEC_MGT_SELECT_STATUS = "Select status.";
    public static final String SEC_MGT_INVALID_SEC_CODE = "Section code invalid.";
    public static final String SEC_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String SEC_MGT_DELETE_NOT_ALLOWED = "Section already assigned. Delete not allowed.";
    //--------------------Section Management---------------//
    //--------------------Status Management-------------------//
    public static final String STATUS_MGT_EMPTY_STATUS_CODE = "Enter status code.";
    public static final String STATUS_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String STATUS_MGT_INVALID_STATUS_CATEGORY_CODE = "Status category code invalid.";
    public static final String STATUS_MGT_INVALID_STATUS_CODE = "Status code invalid.";
    public static final String STATUS_MGT_INVALID_DESCRIPTION = "Description invalid.";
    //--------------------Status Management-------------------//
    //--------------------UserRole Management-------------------//
    public static final String USERROLE_MGT_EMPTY_USERROLE_CODE = "Enter user role code.";
    public static final String USERROLE_MGT_INVALID_USERROLE_CODE = "User role code invalid.";
    public static final String USERROLE_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String USERROLE_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String USERROLE_MGT_INVALID_STATUS = "Select Status.";
    public static final String USERROLE_MGT_INVALID_USERROLETYPECODE = "Select the User Role Type.";
    public static final String USERROLE_MGT_DELETE_NOT_ALLOWED = "User role already assigned. Delete not allowed.";
    public static final String USERROLE_MGT_EMPTY_TXNTYPE = "Assign at least one Transaction type.";
    public static final String USERROLE_MGT_ASSIGNED_TXNTYPE = "Transaction type(s) already assigned for the given User role.";
    public static final String USERROLE_MGT_EMPTY_PAGE = "Assign at least one Page.";
    public static final String USERROLE_MGT_ASSIGNED_PAGE = "Page(s) already assigned for the given User role and Section.";
    public static final String USERROLE_MGT_EMPTY_TASK = "Assign at least one Task.";
    public static final String USERROLE_MGT_ASSIGNED_TASK = "Task(s) already assigned for given User role, Section and Page.";
    //--------------------UserRole Management-------------------//
    //--------------------User Management-----------------------//
    public static final String USER_MGT_EMPTY_USERNAME = "Enter user name.";
    public static final String USER_MGT_EMPTY_EMP_ID = "Enter employer ID.";
    public static final String USER_MGT_EMPTY_FULLNAME = "Enter full name.";
    public static final String USER_MGT_EMPTY_USER_ROLE = "Select user role code.";
    public static final String USER_MGT_EMPTY_STATUS = "Select status.";
    public static final String USER_MGT_EMPTY_BRANCH = "Select branch.";
    public static final String USER_MGT_EMPTY_PASSWORD = "Enter password.";
    public static final String USER_MGT_PASSWORDMISMATCH = "Passwords mismatch";
    public static final String USER_MGT_EMPTY_COM_PASSWORD = "Enter confirm password.";
    public static final String USER_MGT_EMPTY_MERCHANT_ID = "Select agent ID.";
    public static final String USER_MGT_MIX_MATCH_PASSWORD = "Passwords mismatch.";
    public static final String USER_MGT_INVALID_USERNAME = "User name invalid.";
    public static final String USER_MGT_INVALID_EMP_ID = "Invalid employer ID.";
    public static final String USER_MGT_DELETE_NOT_ALLOWED = "User already in use. Delete not allowed.";
    public static final String USER_MGT_USERROLETYPE_NOT_EXIST = "User role type doesn't exist.";
    public static final String USER_MGT_EMPTY_MERCHANT_CUSTOMER = "Select merchant customer";
    public static final String USER_MGT_EMPTY_MERCHANT = "Select merchant";
    //--------------------User Management-----------------------//    
    //--------------------Card info Management-----------------------//
    public static final String CARDINFO_MGT_EMPTY_CARDNO = "Enter cardno.";
    public static final String CARDINFO_MGT_EMPTY_EXPDATE = "Enter Expiry date.";
    public static final String CARDINFO_MGT_INVALID_BAL = "Invalid Balance.";
    public static final String CARDINFO_MGT_EMPTY_NAME = "Enter Name.";
    public static final String CARDINFO_MGT_EMPTY_NIC = "Enter Nic Number.";
    public static final String CARDINFO_MGT_EMPTY_TELNO = "Enter Telephone Number.";
    public static final String CARDINFO_MGT_EMPTY_STATUS = "Select status.";
    public static final String CARDINFO_MGT_INVALID_NAME = "Invalid name";
    public static final String CARDINFO_MGT_INVALID_TELNO = "Invalid telephone number";
    public static final String CARDINFO_MGT_INVALID_NIC = "Invalid Nic Number.";
    public static final String CARDINFO_MGT_SUCCESS_UPLOAD = "File uploaded successfully";
    public static final String CARDINFO_MGT_SUCCESS_UPLOAD_ERRORFILE = "File uploaded successfully and error file generated";
    public static final String CARDINFO_MGT_EMPTY_FILE = "Upload file";
    public static final String CARDINFO_MGT_INVALID_FILE = "Invaid file type";
    public static final String CARDINFO_MGT_ERROR_UPLOAD = "Cannot upload files";
    public static final String CARDINFO_MGT_INVALID_LEN = "Upload file detail length Invalid";
    public static final String CARDINFO_MGT_INVALID_LEN_CARDNO = "Cardno length Invalid";
    public static final String CARDINFO_MGT_INVALID_CARDNO = "Invalid card no";
    public static final String CARDINFO_MGT_INVALID_LEN_EXPDATE = "Expiry date length Invalid";
    public static final String CARDINFO_MGT_INVALID_EXPDATE = "Invalid expiry date";
    public static final String CARDINFO_MGT_INVALID_MON_EXPDATE = "Invalid month in expiry date";
    //--------------------Card info Management-----------------------//
    //--------------------Page Management---------------//
    public static final String PAGE_MGT_EMPTY_PAGE_CODE = "Enter Page code";
    public static final String PAGE_MGT_EMPTY_DESCRIPTION = "Enter Description";
    public static final String PAGE_MGT_EMPTY_URL = "Enter URL";
    public static final String PAGE_MGT_EMPTY_SORTKEY = "Enter sort key";
    public static final String PAGE_MGT_EMPTY_STATUS = "Select Status";
    public static final String PAGE_MGT_EMPTY_USERROLETYPE = "Select User role type";
    public static final String PAGE_MGT_ERROR_SORTKEY_INVALID = "Sort key invalid";
    public static final String PAGE_MGT_ERROR_DESC_INVALID = "Description invalid";
    public static final String PAGE_MGT_ERROR_PAGECODE_INVALID = "Page code invalid";
    //--------------------Page Management---------------//
    //--------------------Task Management---------------//    
    public static final String TASK_MGT_EMPTY_TASK_CODE = "Enter task code.";
    public static final String TASK_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String TASK_MGT_EMPTY_STATUS = "Select status.";
    public static final String TASK_MGT_INVALID_TASK_CODE = "Task code invalid.";
    public static final String TASK_MGT_INVALID_DESCRIPTION = "Description invalid.";
    //--------------------Task Management---------------//
    //--------------------Login---------------//    
    public static final String LOGIN_EMPTY_USERNAME = "User name or password cannot be empty";
    public static final String LOGIN_EMPTY_PASSWORD = "User name or password cannot be empty";
    public static final String LOGIN_INVALID = "Invalid username or password.";
    public static final String LOGIN_ERROR_LOAD = "Cannot login. Please contact administrator";
    public static final String LOGIN_DEACTIVE = "Your account has been deactivated. Please contact administrator";
    public static final String LOGIN_IDLEDEACTIVE = "Your account has been deactivated due to account been idle. Please contact administrator";
    //--------------------Login---------------//
    //--------------------Password Policy Management---------------//    
    public static final String PASSWORDPOLICY_MGT_EMPTY_POLICY_ID = "Enter policy ID.";
    public static final String PASSWORDPOLICY_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String PASSWORDPOLICY_MGT_INVALID_POLICY_ID = "Policy ID invalid.";
    public static final String PASSWORDPOLICY_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String PASSWORDPOLICY_MGT_EMPTY_MIN_LENGTH = "Enter minimum length.";
    public static final String PASSWORDPOLICY_MGT_INVALID_MIN_LENGTH = "Minimum length invalid.";
    public static final String PASSWORDPOLICY_MGT_EMPTY_MAX_LENGTH = "Enter max length.";
    public static final String PASSWORDPOLICY_MGT_INVALID_MAX_LENGTH = "Maximum length invalid.";
    public static final String PASSWORDPOLICY_MGT_INVALID_MIN_MAX_LENGTH = "Minimum length larger than max length.";
    public static final String PASSWORDPOLICY_MGT_EMPTY_SPECIAL_CHARS = "Enter allowed special characters.";
    public static final String PASSWORDPOLICY_MGT_INVALID_SPECIAL_CHARS = "Special characters invalid.";
    public static final String PASSWORDPOLICY_MGT_EMPTY_MIN_SPECIAL_CHARS = "Enter minimum special characters.";
    public static final String PASSWORDPOLICY_MGT_INVALID_MIN_SPECIAL_CHARS = "Minimum special characters invalid.";
    public static final String PASSWORDPOLICY_MGT_EMPTY_MIN_NUM_CHARS = "Enter minimum numeric chars.";
    public static final String PASSWORDPOLICY_MGT_INVALID_MIN_NUM_CHARS = "Minimum numeric characters invalid.";
    public static final String PASSWORDPOLICY_MGT_EMPTY_MIN_UPPER_CHARS = "Enter minimum uppercase characters.";
    public static final String PASSWORDPOLICY_MGT_INVALID_MIN_UPPER_CHARS = "Minimum uppercase characters invalid.";
    public static final String PASSWORDPOLICY_MGT_INVALID_MIN_SPECIAL_CHARS_MAX_LENGTH = "Minimum special characters larger than max length.";
    public static final String PASSWORDPOLICY_MGT_INVALID_MIN_NUM_CHARS_MAX_LENGTH = "Minimum numeric characters larger than max length.";
    public static final String PASSWORDPOLICY_MGT_INVALID_MIN_UPPER_CHARS_MAX_LENGTH = "Minimum upper case characters larger than max length.";
    public static final String PASSWORDPOLICY_MGT_INVALID_LENGTHS = "Total of minimum character length properties exceeds max length of the policy.";
    public static final String PASSWORDPOLICY_MGT_NOT_ALLOWED = "Password Policy assigned. Added not allowed.";
//--------------------Password Policy Management---------------//
    //--------------------Password parameter Management---------------//
    public static final String PASSWORDPARAM_MGT_EMPTY_AGE = "Enter password expire days.";
    public static final String PASSWORDPARAM_MGT_INVALID_AGE = "Password expire day value invalid.";
    public static final String PASSWORDPARAM_MGT_EMPTY_PING = "Enter maximum incorrect login attempts.";
    public static final String PASSWORDPARAM_MGT_INVALID_PING = "Maximum incorrect login attempts invalid.";
    public static final String PASSWORDPARAM_MGT_EMPTY_HISTORY = "Enter no of passwords retained.";
    public static final String PASSWORDPARAM_MGT_INVALID_HISTORY = "No of passwords retained invalid.";
    public static final String PASSWORDPARAM_MGT_EMPTY_INACTTIME = "Enter maximum user idle duration value.";
    public static final String PASSWORDPARAM_MGT_INVALID_INACTTIME = "Maximum user idle duration value invalid.";
    public static final String PASSWORDPARAM_MGT_MASTER_PWD_NEW = "Enter new password.";
    public static final String PASSWORDPARAM_MGT_MASTER_PWD_CONF = "Enter confirm password.";
    public static final String PASSWORDPARAM_MGT_PASSWORDMISMATCH = "Passwords mismatch.";
    //--------------------Password parameter Management---------------//
    //--------------------Password Reset Management---------------//
    public static final String PASSWORDRESET_NEWUSER = "Welcome..! please change your password.";
    public static final String PASSWORDRESET_RESETUSER = "Please reset your new password.";
    public static final String PASSWORDRESET_CHNGPWD = "Enter new password.";
    public static final String PASSWORDRESET_EXPPWD = "Password expired. Please reset your password.";
    public static final String PASSWORDRESET_EMPTY_PASSWORD = "Enter current password.";
    public static final String PASSWORDRESET_EMPTY_NEW_PASSWORD = "Enter new password.";
    public static final String PASSWORDRESET_EMPTY_CONF_PASSWORD = "Enter confirm password.";
    public static final String PASSWORDRESET_MATCH_PASSWORD = "Passwords mismatch.";
    public static final String PASSWORDRESET_INVALID_CURR_PWD = "Current password invalid";
    public static final String PASSWORDRESET_SUCCESS = "Your password changed successfully.To continue, please log-in.";
    public static final String PASSWORDRESET_PASSWORD_TOO_SHORT = "New password too short.";
    public static final String PASSWORDRESET_PASSWORD_TOO_LONG = "New password too long.";
    public static final String PASSWORDRESET_PASSWORD_HISTORY = "You have previously used this password. Please choose a different password.";
    public static final String SYSTEMUSER_CHNPWD_NOTALLOWED = "Password change not allowed.";
    //--------------------Password Reset Management---------------//
    //--------------------Branch Management---------------//    
    public static final String BRANCH_MGT_EMPTY_BRANCHPREFIX = "Enter branch prefix.";
    public static final String BRNACH_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String BRNACH_MGT_EMPTY_SORTKEY = "Enter sort key.";
    public static final String BRANCH_MGT_EMPTY_CONTACTNUM = "Enter contact number.";
    public static final String BRANCH_MGT_EMPTY_STATUS = "Select status.";
    public static final String BRANCH_MGT_INVALID_BRANCHPREFIX = "Branch prefix invalid.";
    public static final String BRNACH_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String BRNACH_MGT_INVALID_REMARKS = "Remarks invalid.";
    public static final String BRNACH_MGT_INVALID_SORTKEY = "Sort key invalid.";
    public static final String BRANCH_MGT_INVALID_CONTACPERSN = "Contact person invalid.";
    public static final String BRANCH_MGT_INVALID_CONTACTNUM = "Contact number invalid.";
    public static final String BRANCH_MGT_DELETE_NOT_ALLOWED = "Branch already assigned. Delete not allowed.";
    //--------------------Branch Management---------------//
    //--------------------Merchant Category Management--------------------//
    public static final String MERCHANT_CAT_MGT_EMPTY_CATEGORYCODE = "Enter agent category code.";
    public static final String MERCHANT_CAT_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String MERCHANT_CAT_MGT_EMPTY_STATUS = "Select status.";
    public static final String MERCHANT_CAT_MGT_INVALID_CATEGORYCODE = "Agent category code invalid.";
    public static final String MERCHANT_CAT_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String MERCHANT_CAT_MGT_INVALID_REMARKS = "Remarks invalid.";
    public static final String MERCHANT_CAT_DELETE_NOT_ALLOWED = "Agent category have agent assigned. Delete not allowed.";
    //--------------------Merchant Category Management--------------------//
    //--------------------TransactionType Management---------------//    
    public static final String TRANSTYPE_MGT_EMPTY_TRANSTYPE_CODE = "Enter trasaction type code.";
    public static final String TRANSTYPE_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String TRANSTYPE_MGT_EMPTY_STATUS = "Select status.";
    public static final String TRANSTYPE_MGT_INVALID_TRANSTYPE_CODE = "Trasaction type code invalid.";
    public static final String TRANSTYPE_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String TRANSTYPE_MGT_DELETE_NOT_ALLOWED = "Transaction type already assigned. Delete not allowed.";
    //--------------------TransactionType Management--------------- 
    //--------------------Merchant Parameter Management---------------//    
    public static final String MERCHANTPARAM_MGT_EMPTY_MERCHANT_CATEGORY = "Enter agent category.";
    public static final String MERCHANTPARAM__MGT_EMPTY_TRANS_TYPE = "Enter transaction type.";
    public static final String MERCHANTPARAM_MGT_EMPTY_STATUS = "Select status.";
    public static final String MERCHANTPARAM_MGT_INVALID_MERCHANT_CUSTOMER = "Merchant customer doesn't exist.";
    public static final String MERCHANTPARAM_MGT_INACTIVE_MERCHANT_CUSTOMER = "Merchant customer is inactive.";
    public static final String MERCHANTPARAM_MGT_INVALID_MINTXN_AMOUNT = "Minimum per transaction amount invalid.(Format should be 10.00)";
    public static final String MERCHANTPARAM_MGT_INVALID_MAXTXN_AMOUNT = "Maximum per transaction amount invalid.(Format should be 10.00)";
    public static final String MERCHANTPARAM_MGT_INVALID_TXNLIMIT_AMOUNT = "Total transaction amount limit invalid.(Format should be 10.00)";
    public static final String MERCHANTPARAM_MGT_INVALID_MAX_NO_OF_TXN = "Maximum no of transactions invalid.";
    public static final String MERCHANTPARAM_MGT_INVALID_TXN_LIMIT = "Total transaction amount limit invalid.";
    public static final String MERCHANTPARAM_MGT_INVALID_COMM_MIN_TXN_AMOUNT = "Minimum Commision Transaction amount invalid.";
    public static final String MERCHANTPARAM_MGT_INVALID_COMM_MIN_TXN_COUNT = "Minimum Commision Transaction count invalid.";
    public static final String MERCHANTPARAM_MGT_INVALID_COMM_PERCENTAGE = "Commission percentage invalid.";
    public static final String MERCHANTPARAM_MGT_INVALID_COMM_TXN_AMOUNT = "Commission amount invalid.";
    public static final String MERCHANTPARAM_MGT_INVALID_THRESHOLD_VALUE = "Threshold value invalid.(Format should be 10.00)";
    public static final String MERCHANTPARAM_MGT_INVALID_PER_TXN_MINMAX_VALUE = "Minimum per transaction amount should be less than its maximum value.";
    public static final String MERCHANTPARAM_MGT_MAX_AMOUNT_TOOLARGE = "Total transaction amount exceeds multiplication of max per transaction amount and max transaction count.";
    public static final String MERCHANTPARAM_MGT_MINTXNAMOUNT_EXC_TXNLIMIT = "Minimum per transaction amount exceeds total transaction amount limit.";
    public static final String MERCHANTPARAM_MGT_MAXTXNAMOUNT_EXC_TXNLIMIT = "Maxmimum per transaction amount exceeds total transaction amount limit.";
    public static final String MERCHANTPARAM_MGT_DELETE_NOT_ALLOWED = "Agent category already assigned. Delete not allowed.";
    public static final String MERCHANTPARAM_MGT_INVALID_THRESHOLD = "Threshold value should be less than total transaction amount limit.";
    //--------------------Merchant Parameter Management--------------- 
    //------------------------ Agent Management ----------------------------//
    public static final String AGENT_MGT_EMTY_AGENT_ID = "Enter agent ID.";
    public static final String AGENT_MGT_EMTY_AGENT_CODE = "Enter agent code.";
    public static final String AGENT_MGT_EMTY_AGENT_CATEGORY = "Enter agent category.";
    public static final String AGENT_MGT_EMTY_AGENT_NAME = "Enter agent name.";
    public static final String AGENT_MGT_EMTY_CONTACT_PERSON = "Enter contact person.";
    public static final String AGENT_MGT_EMTY_CONTACT_NUMBER = "Enter contact number.";
    public static final String AGENT_MGT_EMTY_ACCOUINT_NO = "Enter account no.";
    public static final String AGENT_MGT_EMTY_ADDRESS = "Enter address.";
    public static final String AGENT_MGT_EMTY_BRANCH = "Select branch.";
    public static final String AGENT_MGT_EMTY_STATUS = "Select status.";
    public static final String AGENT_MGT_INVALID_AGENT_ID = "Agent ID invalid.";
    public static final String AGENT_MGT_INVALID_AGENT_NAME = "Agent name invalid.";
    public static final String AGENT_MGT_INVALID_CONTACT_PERSON = "Contact person invalid.";
    public static final String AGENT_MGT_INVALID_CONTACT_NUMBER = "Contact number invalid.";
    public static final String AGENT_MGT_INVALID_EMAIL = "E-mail invalid.";
    public static final String AGENT_MGT_INVALID_ACCOUINT_NO = "Account no invalid.";
    public static final String AGENT_MGT_INVALID_FAX = "Fax invalid.";
    public static final String AGENT_MGT_INVALID_ADDRESS = "Address invalid.";
    public static final String AGENT_MGT_DELETE_NOT_ALLOWED = "Agent assigned. Delete not allowed.";
    public static final String AGENT_MGT_AGENT_BRANCH_EXISTS = "Agent Branch already exists.";
    public static final String AGENT_MGT_EMTY_SOFTWARE_VERSION = "Enter software version.";
    public static final String AGENT_MGT_EMPTY_TERMINAL_COUNT = "No existing terminal(s) for the respective agent.";
    public static final String AGENT_MGT_TERMINAL_VERSION_UPDATED_SUCCESS = "Terminal(s) updated successfully for the respective agent.";
    //------------------------ Agent Management ----------------------------//
    //--------------------Terminal Parameter Management---------------//    
    public static final String TERMPARAM_MGT_EMPTY_TERM_IDLE_TIME = "Enter mobile terminal idle time amount.";
    public static final String TERMPARAM_MGT_EMPTY_TERM_IDLE_TIME_UNIT = "Enter mobile terminal idle time unit.";
    public static final String TERMPARAM_MGT_EMPTY_MIN_PWD_LEN = "Enter minimum password length amount.";
    public static final String TERMPARAM_MGT_EMPTY_MIN_PWD_LEN_UNIT = "Enter minimum password length unit.";
    public static final String TERMPARAM_MGT_EMPTY_USR_ATTMP = "Enter invalid user attempts amount.";
    public static final String TERMPARAM_MGT_EMPTY_USR_ATTMP_UNIT = "Enter invalid user attempts unit.";
    public static final String TERMPARAM_MGT_INVALID_TERM_IDLE_TIME = "Mobile terminal idle time amount invalid.";
    public static final String TERMPARAM_MGT_INVALID_MIN_PWD_LEN = "Mobile terminal password length amount  invalid.";
    public static final String TERMPARAM_MGT_INVALID_INVAL_USR_ATTMP = "Invalid user attempts amount invalid.";
    //--------------------Terminal Parameter Management--------------- 
    //--------------------Terminal Management---------------// 
    public static final String TERMINAL_MGT_EMPTY_TERMINALID = "Enter terminal id.";
    public static final String TERMINAL_MGT_EMPTY_DESCRIPTION = "Enter terminal description.";
    public static final String TERMINAL_MGT_EMPTY_SERIAL_NO = "Enter serial number.";
    public static final String TERMINAL_MGT_EMPTY_MODEL_NO = "Enter model number.";
    public static final String TERMINAL_MGT_EMPTY_SOFTWARER_VERASION = "Select software version.";
    public static final String TERMINAL_MGT_EMPTY_STATUS = "Select status.";
    public static final String TERMINAL_MGT_EMPTY_BRANCH = "Select branch.";
    public static final String TERMINAL_MGT_EMPTY_AGENT_ID = "Select agent ID.";
    public static final String TERMINAL_MGT_EMPTY_IMEI_NO = "Enter IMEI number.";
    public static final String TERMINAL_MGT_EMPTY_PASSCODE = "Enter passcode.";
    public static final String TERMINAL_MGT_INVALID_IMEI_NO = "Terminal IMEI number invalid.";
    public static final String TERMINAL_MGT_EMPTY_ASSET_ID = "Enter asset ID.";
    public static final String TERMINAL_MGT_ASSET_ID_EXISTS = "Asset ID already exists.";
    public static final String TERMINAL_MGT_IMEI_NO_EXISTS = "IMEI number already exists.";
    public static final String TERMINAL_MGT_SERIAL_NO_EXISTS = "Serial number already exists.";
    public static final String TERMINAL_MGT_DELETE_NOT_ALLOWED = "Terminal already assigned. Delete not allowed.";
    public static final String TERMINAL_MGT_INVALID_PASSCODE = "Terminal passcode invalid.";
    public static final String TERMINAL_MGT_INVALID_PASSCODE_LENGTH = "The passcode must be 4 characters long.";
    public static final String TERMINAL_MGT_INVALID_ASSETID_LENGTH = "The asset ID must be 4 characters long.";
    public static final String TERMINAL_MGT_UPDATE_NOT_ALLOWED_LOGGED_IN = "Terminal signed in. Edit not allowed.";
    public static final String TERMINAL_MGT_DELETE_NOT_ALLOWED_LOGGED_IN = "Terminal signed in. Delete not allowed.";
    public static final String RECORD_ALREADY_EXIST_FOR_TERMINAL_ID = "Record already exist for given terminal id";
    //--------------------Terminal Management--------------- 
    //--------------------Terminal Assign Management---------------//    
    public static final String TERMINALASSIGN_MGT_EMPTY_TERMINAL_ID = "Select terminal.";
    public static final String TERMINALASSIGN_MGT_EMPTY_AGENT = "Select agent.";
    public static final String TERMINALASSIGN_MGT_TERMINAL_EXISTS = "Terminal already exists.";
    //--------------------Terminal Assign Management--------------- 
    //--------------------Terminal User Assign Management---------------//    
    public static final String TERMINALUSERASSIGN_MGT_EMPTY_TERMINAL_ID = "Select terminal.";
    public static final String TERMINALUSERASSIGN_MGT_EMPTY_TERMINALUSER = "Select agent.";
    public static final String TERMINALUSERASSIGN_MGT_TERMINAL_TERMINALUSER_EXISTS = "Terminal-Agent user already exists.";
    //--------------------Terminal User Assign Management--------------- 
    //--------------------Merchant User Management---------------//  
    public static final String MERCHANTUSER_MGT_USERNAME_ALREADY_EXISTS = "Record already exists for the given username";
    //--------------------Merchant User Management---------------//
    //--------------------Country Management---------------// 
    public static final String COUNTRY_MGT_EMPTY_COUNTRY_CODE = "Enter country code.";
    public static final String COUNTRY_MGT_EMPTY_ALPHA_CODE = "Enter alpha code .";
    public static final String COUNTRY_MGT_INVALID_ALPHA_CODE = "Invalid alpha code.";
    public static final String COUNTRY_MGT_EMPTY_ALPHA_3_CODE = "Enter alpha code (3).";
    public static final String COUNTRY_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String COUNTRY_MGT_EMPTY_FRAUD_VALUE = "Enter fraud value.";
    public static final String COUNTRY_MGT_INVALID_COUNTRY_CODE = "Country code invalid.";
    public static final String COUNTRY_MGT_INVALID_ALPHA_2_CODE = "Alpha code (2) invalid.";
    public static final String COUNTRY_MGT_INVALID_ALPHA_3_CODE = "Alpha code (3) invalid.";
    public static final String COUNTRY_MGT_INVALID_DESCRIPTION = "Enter Description.";
    public static final String COUNTRY_MGT_INVALID_FRAUD_VALUE = "Fraud value invalid.";
    public static final String COUNTRY_MGT_INVALID_REGION = "Region invalid.";
    public static final String COUNTRY_MGT_EMPTY_STATUS = "Select status.";
    public static final String COUNTRY_MGT_DELETE_NOT_ALLOWED = "Country already assigned. Delete not allowed.";
    //--------------------Country Management---------------//
    //--------------------Currency Management---------------// 
    public static final String CURRENCY_MGT_EMPTY_CURRENCY_CODE = "Enter currency code.";
    public static final String CURRENCY_MGT_EMPTY_ALPHA_CODE = "Enter alpha2 code .";
    public static final String CURRENCY_MGT_EMPTY_EXPONENT = "Enter exponent.";
    public static final String CURRENCY_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String CURRENCY_MGT_EMPTY_STATUS = "Select status.";
    public static final String CURRENCY_MGT_INVALID_CURRENCY_CODE = "Currency code invalid.";
    public static final String CURRENCY_MGT_INVALID_ALPHA_CODE = "Alpha code invalid.";
    public static final String CURRENCY_MGT_INVALID_EXPONENT = "Exponent invalid.";
    public static final String CURRENCY_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String CURRENCY_MGT_DELETE_NOT_ALLOWED = "Currency already assigned. Delete not allowed.";
    public static final String CURRENCY_MGT_CURRENCY_CODE_EXISTS = "Currency already exist";
    //--------------------Currency Management---------------//
    //--------------------CardBin Management---------------// 
    public static final String CARDBIN_MGT_EMPTY_BINPROF_CODE = "Enter bin profile code.";
    public static final String CARDBIN_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String CARDBIN_MGT_EMPTY_STATUS = "Select status.";
    public static final String CARDBIN_MGT_EMPTY_START_BIN = "Enter starting bin.";
    public static final String CARDBIN_MGT_EMPTY_END_BIN = "Enter ending bin.";
    public static final String CARDBIN_MGT_INVALID_BINPROF_CODE = "Bin profile code invalid.";
    public static final String CARDBIN_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String CARDBIN_MGT_INVALID_START_BIN = "Starting bin invalid.";
    public static final String CARDBIN_MGT_INVALID_END_BIN = "Ending bin invalid.";
    public static final String CARDBIN_MGT_INVALID_BIN_VAL_DIFFERENCE = "Starting bin larger than ending bin.";
    //--------------------CardBin Management---------------//
    //--------------------Fraud Profile Management---------------// 
    public static final String FRAUD_PROFILE_MGT_EMPTY_FR_PROF_CODE = "Enter fraud profile code.";
    public static final String FRAUD_PROFILE_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String FRAUD_PROFILE_MGT_EMPTY_STATUS = "Enter status.";
    public static final String FRAUD_PROFILE_MGT_INVALID_FR_PROF_CODE = "Fraud profile code invalid.";
    public static final String FRAUD_PROFILE_MGT_INVALID_DESCRIPTION = "Description invalid.";
    //--------------------Fraud Profile Management---------------//
    //--------------------Terminal Monitor Management---------------// 
    public static final String TERMINAL_MONITOR_MGT_NO_DATA = "No active terminals found.";
    public static final String TERMINAL_MONITOR_MGT_NO_TERMINAL_AGENTUSER_DATA = "No recently used terminals found under given Terminal ID and Agent user ID.";
    public static final String TERMINAL_MONITOR_MGT_NO_TERMINAL_DATA = "No recently used terminals found under given Terminal ID.";
    public static final String TERMINAL_MONITOR_MGT_NO_AGENTUSER_DATA = "No recently used terminals found under given Agent Username.";
    //--------------------Terminal Monitor Management---------------//
    //--------------------Agent User Management---------------//
    public static final String AGENTUSER_MGT_EMPTY_USERNAME = "Enter agent username.";
    public static final String AGENTUSER_MGT_EMPTY_USERCODE = "Enter user code.";
    public static final String AGENTUSER_MGT_EMPTY_USERROLE = "Select user role.";
    public static final String AGENTUSER_MGT_EMPTY_AGENT = "Select agent.";
    public static final String AGENTUSER_MGT_EMPTY_USER_INQUIRY = "Username not mapped to any agent user";
    public static final String AGENTUSER_MGT_USER_INQUIRY_SWITCH_OFFLINE = "Switch offline request cannot be processed";
    public static final String AGENTUSER_MGT_USER_INQUIRY_SOCKET_TIMEOUT = "Comminucation failure";
    public static final String AGENTUSER_EMPTY_PASSWORD = "Enter password.";
    public static final String AGENTUSER_EMPTY_CONFPASSWORD = "Enter confirm password.";
    public static final String AGENTUSER_EMPTY_STATUS = "Select status.";
    public static final String AGENTUSER_INVALID_USERNAME = "Agent username invalid";
    public static final String AGENTUSER_MGT_PASSWORDMISMATCH = "Passwords mismatch";
    public static final String AGENTUSER_INVALID_PASSWORD = "Invalid password length.";
    public static final String AGENTUSER_MGT_USERNAME_EXISTS = "Record already exists for given Username.";
    public static final String AGENTUSER_MGT_USERCODE_EXISTS = "Record already exists for given User code.";
    public static final String AGENTUSER_MGT_UPDATE_NOT_ALLOWED_LOGGED_IN = "Agent user signed in. Edit not allowed.";
    public static final String AGENTUSER_MGT_DELETE_NOT_ALLOWED_LOGGED_IN = "Agent user signed in. Delete not allowed.";
    public static final String AGENTUSER_MGT_ACTIVE_DEACTIVE_NOT_ALLOWED_LOGGED_IN = "Agent user signed in. Activate or Deactivate not allowed.";
    public static final String AGENTUSER_MGT_PASSWORD_RESET_NOT_ALLOWED_LOGGED_IN = "Agent user signed in. Password Reset not allowed.";
    //--------------------Agent User Management---------------//
    //--------------------Terminal Version Management---------------//    
    public static final String TERMINAL_VERSION_MGT_EMPTY_VERSIONID = "Enter terminal version.";
    public static final String TERMINAL_VERSION_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String TERMINAL_VERSION_MGT_EMPTY_EFFECTIVEDATE = "Enter effective date.";
    public static final String TERMINAL_VERSION_MGT_EMPTY_STATUS = "Select status.";
    public static final String TERMINAL_VERSION_MGT_DELETE_NOT_ALLOWED = "Terminal version already assigned. Delete not allowed.";
    public static final String TERMINAL_VERSION_MGT_INVALID_EFFECTIVEDATE = "Cannot be update before effective date.";
    //--------------------Terminal Version Management---------------//
    //--------------------Operator Hour Management---------------//
    public static final String OPERHOUR_MGT_EMPTY_FROMDATE = "Enter from time.";
    public static final String OPERHOUR_MGT_INVALID_FROMDATE = "From time invalid";
    public static final String OPERHOUR_MGT_EMPTY_TODATE = "Enter to time.";
    public static final String OPERHOUR_MGT_INVALID_TODATE = "To time invalid";
    public static final String OPERHOUR_MGT_EMPTY_FROMDATE_TIMEPER = "Enter from time period.";
    public static final String OPERHOUR_MGT_INVALID_FROMDATE_TIMEPER = "From time period invalid";
    public static final String OPERHOUR_MGT_EMPTY_TODATE_TIMEPER = "Enter to time period.";
    public static final String OPERHOUR_MGT_INVALID_TODATE_TIMEPER = "To time period invalid";
    public static final String OPERHOUR_MGT_INVALID_TIME_DIFFERNCE = "Time difference invalid";
    //--------------------Operator Hour Management---------------//
    //--------------------Terminal Model Management---------------//    
    public static final String TERMINAL_MODEL_DELETE_NOT_ALLOWED = "Merchant category already assigned. Delete not allowed.";
    public static final String TERMINAL_MODEL_MGT_EMPTY_CODE = "Enter device model code.";
    public static final String TERMINAL_MODEL_MGT_INVALID_CODE = "Device Model code invalid.";
    public static final String TERMINAL_MODEL_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String TERMINAL_MODEL_MGT_EMPTY_DESCRIPTION = "Enter Description.";
    public static final String TERMINAL_MODEL_MGT_INVALID_CATEGORY = "Device Model Code invalid.";
    public static final String TERMINAL_MODEL_MGT_EMPTY_MODEL = "Enter device model.";
    public static final String TERMINAL_MODEL_MGT_EMPTY_STATUS = "Select status.";
    public static final String TERMINAL_MODEL_MGT_EMPTY_BRAND = "Select Device Brand.";
    public static final String TERMINAL_MODEL_MGT_UPDATE_NOT_ALLOWED = "Device model already used. Cannot be deactivate.";
    public static final String TERMINAL_MODEL_MGT_DELETE_NOT_ALLOWED = "Device model assigned. Delete not allowed.";
    //--------------------Terminal Model Management---------------//
    //-------------------- Document Type Management ------------------//
    public static final String DOCUMENT_TYPE_EMPTY_DOCUMENT_TYPE_CODE = "Enter document type code.";
    public static final String DOCUMENT_TYPE_EMPTY_EXTENSION_TYPE = "Enter extension type.";
    public static final String DOCUMENT_TYPE_EMPTY_DESCRIPTION = "Enter description.";
    public static final String DOCUMENT_TYPE_EMPTY_STATUS = "Select status.";
    public static final String DOCUMENT_TYPE_INVALID_DESCRIPTION = "Description invalid.";
    public static final String DOCUMENT_TYPE_DELETE_NOT_ALLOWED = "Document type already assigned. Delete not allowed.";
    public static final String DOCUMENT_TYPE_EMPTY_DOCUMENT_CATEGORY = "Select document category.";
    //------------------- Document Type Management ------------------//
    //--------------------Merchant Profile Management---------------//  
    public static final String MERCHANT_PROFILE_MGT_EMPTY_PROFILE_TYPE = "Select profile type.";
    public static final String MERCHANT_PROFILE_MGT_EMPTY_DOCUMENT_TYPE = "Select document type.";
    public static final String MERCHANT_PROFILE_MGT_EMPTY_STATUS = "Select status.";
    public static final String MERCHANT_PROFILE_DELETE_NOT_ALLOWED = "Merchant document profile delete not allowed.";
    //--------------------Merchant Profile Management---------------//  
    //-------------------- Document Type Management ------------------//
    public static final String MERCHANT_USER_EMPTY_MERCHANT_ID = "Enter merchant id.";
    public static final String MERCHANT_USER_EMPTY_USER_NAME = "Enter user name.";
    public static final String MERCHANT_USER_EMPTY_PASSWORD = "Enter password.";
    public static final String MERCHANT_USER_EMPTY_COM_PASSWORD = "Enter confirm password.";
    public static final String MERCHANT_USER_EMPTY_STARUS = "Select status.";
    public static final String MERCHANT_USER_DELETE_NOT_ALLOWED = "Merchant user already assigned. Delete not allowed.";
    public static final String MERCHANT_USER_PASSWORDMISMATCH = "Passwords mismatch";
    public static final String MERCHANT_USER_EMPTY_TXNTYPE = "Please assign at least one Transaction type.";
    public static final String MERCHANT_USER_ASSIGNED_TXNTYPE = "Transaction type(s) already assigned for the given Merchant User.";
    //------------------- Document Type Management ------------------//
    //--------------------Merchant Management---------------//
    public static final String MERCHANT_IMAGE_NOT_FOUND = "Image doesn't exist.";
    public static final String MERCHANT_PROFILE_DOCUMENTS_NOT_FOUND = "Documents doesn't exist.";
    public static final String MERCHANT_CREATION_MANDATORY_DOCUMENTS_EMPTY = "Select merchant documents.";
    public static final String MERCHANT_CREATION_DOCUMENTS_EMPTY = "Empty ";
    public static final String MERCHANT_EXISTS = "Merchant exists for the given merchant id.";
    public static final String MERCHANT_MGT_EMPTY_MERCHANT_CUSTOMER = "Select merchant customer.";
    public static final String MERCHANT_MGT_EMPTY_MERCHANT_TYPE = "Select merchant type.";
    public static final String MERCHANT_MGT_EMPTY_MERCHANT_ID = "Enter merchant ID.";
    public static final String MERCHANT_MGT_EMPTY_CONTACT_NUMBER = "Enter valid mobile number.";
    public static final String MERCHANT_MGT_EMPTY_COUNTRY = "Select country.";
    public static final String MERCHANT_MGT_EMPTY_PROVINCE = "Select province.";
    public static final String MERCHANT_MGT_EMPTY_DISTRICT = "Select district.";
    public static final String MERCHANT_MGT_EMPTY_ACCOUNT_NUMBER = "Enter account number.";
    public static final String MERCHANT_MGT_EMPTY_MCC = "Select MCC.";
    public static final String MERCHANT_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String MERCHANT_MGT_EMPTY_CONTACT_PERSON = "Enter contact person.";
    public static final String MERCHANT_MGT_EMPTY_CONTACT_PERSON_POSITION = "Enter contact person position.";
    public static final String MERCHANT_MGT_EMPTY_ADDRESS = "Enter address.";
    public static final String MERCHANT_MGT_EMPTY_CITY = "Select city.";
    public static final String MERCHANT_MGT_EMPTY_POSTAL_CODE = "Enter postal code.";
    public static final String MERCHANT_MGT_EMPTY_FAX = "Enter fax.";
    public static final String MERCHANT_MGT_EMPTY_EMAIL = "Enter e-mail.";
    public static final String MERCHANT_MGT_EMPTY_ACCOUNT_NAME = "Enter account name.";
    public static final String MERCHANT_MGT_EMPTY_ACCOUNT_TYPE = "Select account type.";
    public static final String MERCHANT_MGT_EMPTY_PAYMENT_CYCLE = "Select payment cycle.";
    public static final String MERCHANT_MGT_EMPTY_STATUS = "Select status.";
    public static final String MERCHANT_MGT_EMPTY_BRANCH = "Select branch.";
    public static final String MERCHANT_MGT_EMPTY_REMARK = "Enter remark.";
    public static final String MERCHANT_MGT_NOT_ACTIVE = "selected merchant is not activated.";
    public static final String MERCHANT_MGT_NOT_EMPTY_TXNTYPE = "Please assign at least one Transaction type.";
    public static final String MERCHANT_MGT_EMPTY_TERMINAL = "Please assign at least one Terminal.";
    public static final String MERCHANT_MGT_ASSIGNED_TXNTYPE = "Transaction type(s) already assigned for the given Merchant.";
    public static final String MERCHANT_MGT_ASSIGNED_NOTIFICATION = "Notification already assigned for the given Merchant.";
    public static final String MERCHANT_MGT_ASSIGNED_CURRENCY = "Currency(s) already assigned for the given Merchant.";
    public static final String MERCHANT_MGT_EMPTY_CURRENCY = "Please assign at least one currency.";
    public static final String MERCHANT_MGT_DELETE_NOT_ALLOWED = "Merchant already assigned. Delete not allowed.";

    //--------------------Merchant Management---------------//
    //--------------------TransactionType Profile Management---------------//    
    public static final String TRANSACTION_TYPE_PROFILE_EMPTY_PROFILE_CODE = "Enter Profile Code.";
    public static final String TRANSACTION_TYPE_PROFILE_EMPTY_DESCRIPTION = "Enter description.";
    public static final String TRANSACTION_TYPE_PROFILE_EMPTY_SORTKEY = "Enter sort key.";
    public static final String TRANSACTION_TYPE_PROFILE_EMPTY_CONTACTNUM = "Enter contact number.";
    public static final String TRANSACTION_TYPE_PROFILE_EMPTY_STATUS = "Select status.";
    public static final String TRANSACTION_TYPE_PROFILE_INVALID_BRANCHPREFIX = "Branch prefix invalid.";
    public static final String TRANSACTION_TYPE_PROFILE_INVALID_DESCRIPTION = "Description invalid.";
    public static final String TRANSACTION_TYPE_PROFILE_INVALID_REMARKS = "Remarks invalid.";
    public static final String TRANSACTION_TYPE_PROFILE_INVALID_SORTKEY = "Sort key invalid.";
    public static final String TRANSACTION_TYPE_PROFILE_INVALID_CONTACPERSN = "Contact person invalid.";
    public static final String TRANSACTION_TYPE_PROFILE_INVALID_CONTACTNUM = "Contact number invalid.";
    public static final String TRANSACTION_TYPE_PROFILE_DELETE_NOT_ALLOWED = "Transactions already assigned. Delete not allowed.";
    public static final String COMMON_ALREADY_TRANSACTION_ASSIGN_REQUESTED = "Transaction(s) requested to be assigned.";
    //--------------------TransactionType Profile Management---------------//
    //--------------------Fee Management---------------//    
    public static final String FEE_MGT_EMPTY_CODE = "Enter fee code.";
    public static final String FEE_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String FEE_MGT_EMPTY_SORTKEY = "Enter sort key.";
    public static final String FEE_MGT_EMPTY_CONTACTNUM = "Enter contact number.";
    public static final String FEE_MGT_EMPTY_STATUS = "Select status.";
    public static final String FEE_MGT_EMPTY_CURRENCY = "Select currency.";
    public static final String FEE_MGT_INVALID_CODE = "Branch prefix invalid.";
    public static final String FEE_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String FEE_MGT_INVALID_REMARKS = "Remarks invalid.";
    public static final String FEE_MGT_INVALID_SORTKEY = "Sort key invalid.";
    public static final String FEE_MGT_INVALID_CONTACPERSN = "Contact person invalid.";
    public static final String FEE_MGT_INVALID_CONTACTNUM = "Contact number invalid.";
    public static final String FEE_MGT_INVALID_MIN_MAX = "Invalid Min and Max amounts";
    public static final String FEE_MGT_INVALID_MIN = "Invalid Min amount";
    public static final String FEE_MGT_INVALID_MAX = "Invalid Max amount";
    public static final String FEE_MGT_INVALID_FEE_PERCENT = "Invalid Fee percent";
    public static final String FEE_MGT_DELETE_NOT_ALLOWED = "Fee already assigned. Delete not allowed.";
    //--------------------Fee Management---------------//
    //--------------------Fee Profile Management---------------//    
    public static final String FEE_PROFILE_EMPTY_PROFILE_CODE = "Enter Profile Code.";
    public static final String FEE_PROFILE_EMPTY_DESCRIPTION = "Enter description.";
    public static final String FEE_PROFILE_EMPTY_SORTKEY = "Enter sort key.";
    public static final String FEE_PROFILE_EMPTY_CONTACTNUM = "Enter contact number.";
    public static final String FEE_PROFILE_EMPTY_STATUS = "Select status.";
    public static final String FEE_PROFILE_INVALID_BRANCHPREFIX = "Branch prefix invalid.";
    public static final String FEE_PROFILE_INVALID_DESCRIPTION = "Description invalid.";
    public static final String FEE_PROFILE_INVALID_REMARKS = "Remarks invalid.";
    public static final String FEE_PROFILE_INVALID_SORTKEY = "Sort key invalid.";
    public static final String FEE_PROFILE_INVALID_CONTACPERSN = "Contact person invalid.";
    public static final String FEE_PROFILE_INVALID_CONTACTNUM = "Contact number invalid.";
    public static final String FEE_PROFILE_DELETE_NOT_ALLOWED = "Fee already assigned. Delete not allowed.";
    public static final String COMMON_ALREADY_FEE_ASSIGN_REQUESTED = "Fee(s) requested to be assigned.";
    //--------------------Fee Profile Management---------------//
    //--------------------Merchant Terminal Management---------------//
    public static final String MERCHANT_TERMINAL_NO__DATA = "No recently used merchant terminal found under given  ID";
    public static final String MERCHANT_TERMINAL_EMPTY_TERMINAL_ID = "Enter terminal id.";
    public static final String MERCHANT_TERMINAL_EMPTY_MERCHANT = "Select merchant.";
    public static final String MERCHANT_TERMINAL_EMPTY_MAKE = "Enter make.";
    public static final String MERCHANT_TERMINAL_EMPTY_MODEL = "Select model.";
    public static final String MERCHANT_TERMINAL_EMPTY_IMEI = "Enter IMEI.";
    public static final String MERCHANT_TERMINAL_EMPTY_REMARK = "Enter remark.";
    public static final String MERCHANT_TERMINAL_EMPTY_RISKPARAM = "Enter riskparam.";
    public static final String MERCHANT_TERMINAL_EMPTY_OTP = "Enter otp.";
    public static final String MERCHANT_TERMINAL_EMPTY_PUSHID = "Enter pushid.";
    public static final String MERCHANT_TERMINAL_EMPTY_NOTIFICATION_TYPE = "Select notification type.";
    public static final String MERCHANT_TERMINAL_EMPTY_MOBILE_NUMBER = "Enter valid mobile number.";
    public static final String MERCHANT_TERMINAL_DELETE_NOT_ALLOWED = "Merchant terminal already assigned. Delete not allowed.";
    //--------------------Merchant Terminal Management---------------// 
    //--------------------- Merchant Customer Management -----------------//
    public static final String MERCHANT_CUSTOMER_MOBILE_LOGO_NOT_FOUND = "Mobile logo doesn't exist.";
    public static final String MERCHANT_CUSTOMER_WEB_LOGO_NOT_FOUND = "Web logo doesn't exist.";
    public static final String MERCHANT_CUSTOMER_EMPTY_ID_TYPE = "Select id type.";
    public static final String MERCHANT_CUSTOMER_EMPTY_ID_NO = "Enter id no.";
    public static final String MERCHANT_CUSTOMER_EMPTY_LEGAL_NAME = "Enter legal name.";
    public static final String MERCHANT_CUSTOMER_EMPTY_CONTACT_PERSON = "Enter contact person.";
    public static final String MERCHANT_CUSTOMER_EMPTY_CONTACT_PERSON_POSITION = "Enter contact person position.";
    public static final String MERCHANT_CUSTOMER_EMPTY_ADDRESS = "Enter address.";
    public static final String MERCHANT_CUSTOMER_EMPTY_BRANCH = "Select branch.";
    public static final String MERCHANT_CUSTOMER_EMPTY_POSTAL_CODE = "Enter postal code.";
    public static final String MERCHANT_CUSTOMER_EMPTY_CONTACT_NUMBER = "Enter contact number.";
    public static final String MERCHANT_CUSTOMER_EMPTY_FAX = "Enter fax.";
    public static final String MERCHANT_CUSTOMER_EMPTY_EMAIL = "Enter email.";
    public static final String MERCHANT_CUSTOMER_EMPTY_COUNTRY = "Select country.";
    public static final String MERCHANT_CUSTOMER_EMPTY_PROVINCE = "Select province.";
    public static final String MERCHANT_CUSTOMER_EMPTY_DISTRICT = "Select district.";
    public static final String MERCHANT_CUSTOMER_EMPTY_CITY = "Select city.";
    public static final String MERCHANT_CUSTOMER_EMPTY_REMARK = "Enter remark.";
    public static final String MERCHANT_CUSTOMER_EMPTY_STATUS = "Select status.";
    public static final String MERCHANT_CUSTOMER_MGT_DELETE_NOT_ALLOWED = "Merchant customer already assigned. Delete not allowed.";
//--------------------- Merchant Customer Management -----------------//
    //--------------------Binrange Management---------------//    
    public static final String BINRANGE_MGT_EMPTY_BINRANGE = "Enter bin range.";
    public static final String BINRANGE_MGT_INVALID_BINRANGE = "Bin range invalid.";
    public static final String BINRANGE_MGT_INVALID_BINRANGE_LENGTH = "The bin range must be 6 characters long.";
    public static final String BINRANGE_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String BINRANGE_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String BINRANGE_MGT_EMPTY_CARDTYPE = "Select card type.";
    public static final String BINRANGE_MGT_EMPTY_CURRENCY = "Select currency.";
    public static final String BINRANGE_MGT_EMPTY_ONUSOFFUS = "Select On-us/Off-us.";
    public static final String BINRANGE_MGT_EMPTY_ACQUIRER_ISSUER = "Select Acquirer/Issuer.";
    public static final String BINRANGE_MGT_EMPTY_PANLENGTH = "Enter pan length.";
    public static final String BINRANGE_MGT_INVALID_PANLENGTH = "Pan length invalid.";
    public static final String BINRANGE_MGT_EMPTY_STATUS = "Select status.";
    public static final String BINRANGE_ALREADY_EXISTS = "Record already exists.";
    public static final String BINRANGE_DELETE_NOT_ALLOWED = "Bin range already assigned. Delete not allowed.";
    //--------------------Binrange Management---------------//
    //--------------------Merchant QR Management---------------//
    public static final String MERCHANT_QR_TEMP_INSERT = "requested to be generated.";
    public static final String MERCHANT_QR_INAVALID_QR_DATA_OBJECT = "Invalid Qr data Object.";
    public static final String MERCHANT_QR_INVALID_INPUTS = "Invalid inputs found while processing Qr generation.";
    public static final String MERCHANT_QR_EMPTY_QRTYPE = "Select QR Type.";
    public static final String MERCHANT_QR_EMPTY_TRANSACTION_AMOUNT = "Enter transaction amount.";
    //--------------------Merchant QR Management---------------//
    //----------------------------Merchant Pan Management-------------------------//
    public static final String MERCHANT_PAN_MGT_EMPTY_MERCHNAT_ID = "Select merchant id.";
    public static final String MERCHNAT_PAN_MGT_EMPTY_CURRENCY = "Select currency.";
    public static final String MERCHANT_PAN_MGT_EMPTY_CARD_TYPE = "Select card type.";
    public static final String MERCHANT_PAN_MGT_EMPTY_BIN = "Enter bin.";
    public static final String MERCHNAT_PAN_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String MERCHNAT_PAN_EMPTY_STATUS = "Select status.";
    public static final String MERCHANT_PAN_ALREADY_EXISTS = "Record already exists for this merchant pan";
    public static final String MERCHANT_PAN_ALREADY_EXISTS_FOR_MERCHANT_AND_BIN = "Record already exists for this merchant and bin";
    public static final String MERCHANT_PAN_CURRENCY_NOT_ALLOW = "Currency not allow to given merchant";
    //----------------------------Merchant Pan Management-------------------------//
    //----------------------------Terms and Condition Management-------------------------//
    public static final String TERMS_AND_CONDITION_MGT_EMPTY_CATEGORY = "Select Category.";
    public static final String TERMS_AND_CONDITION_MGT_EMPTY_STATUS = "Select status.";
    public static final String TERMS_AND_CONDITION_MGT_EMPTY_FILE = "Select valid file.";
    public static final String TERMS_AND_CONDITION_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String TERMS_AND_CONDITION_MGT_ERROR_ON_DOCUMENT_INSERT = "Error occurred while insert document blob";
    public static final String TERMS_AND_CONDITION_MGT_FILE_NOT_FOUND = "File not found";
    //----------------------------Terms and Condition Management-------------------------//
    //--------------------Message Template Management---------------//    
    public static final String MESSAGETEMPLATE_MGT_EMPTY_TEMPLATECODE = "Enter template code.";
    public static final String MESSAGETEMPLATE_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String MESSAGETEMPLATE_MGT_EMPTY_STATUS = "Select status.";
    public static final String MESSAGETEMPLATE_MGT_EMPTY_MESSAGE = "Enter message.";
    //--------------------Message Template Management---------------//
    //--------------------Mail Template Management---------------//    
    public static final String MAILTEMPLATE_MGT_EMPTY_TEMPLATECODE = "Enter template code.";
    public static final String MAILTEMPLATE_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String MAILTEMPLATE_MGT_EMPTY_STATUS = "Select status.";
    public static final String MAILTEMPLATE_MGT_EMPTY_SUBJECT = "Select subject.";
    public static final String MAILTEMPLATE_MGT_EMPTY_MESSAGE = "Enter message.";
    //--------------------Mail Template Management---------------//
    //--------------------Commission profile Management---------------//
    public static final String COMMISSIONPROFILE_MGT_EMPTY_PROFILE_CATEGORY = "Select profile category.";
    public static final String COMMISSIONPROFILE_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String COMMISSIONPROFILE_MGT_EMPTY_SLABS_TYPE = "Select slabs type.";
    public static final String COMMISSIONPROFILE_MGT_EMPTY_STATUS = "Select status.";
    public static final String COMMISSIONPROFILE_MGT_EMPTY_CALCULATION_TYPE = "Select calculation type.";
    public static final String COMMISSIONPROFILE_MGT_EMPTY_SLASBS = "Enter slabs.";
    public static final String COMMISSIONPROFILE_MGT_INVALID_SLABS = "Slabs invalid.";
    public static final String COMMISSIONPROFILE_MGT_INVALID_SLABS_MIN_MAX = "Invalid minamount and maxamount slabs.";
    public static final String COMMISSIONPROFILE_MGT_COMMISSION_PROFILE_NOT_EXISTED = "Commission profile not exist.";
    public static final String COMMISSIONPROFILE_MGT_COMMISSION_PROFILE_ALREADY_EXIST = "Commission profile already exist.";
    public static final String COMMISSIONPROFILE_MGT_COMMISSION_PROFILE_DELETE_NOT_ALLOWED = "Commission Profile already assigned. Delete not allowed.";
    //--------------------Commission profile Management---------------//
    //------------------------------- SWT Master configuration ---------------------------//
    public static final String MASTER_CONFIGURATION_INVALID_ID = "Invalid id";
    public static final String MASTER_CONFIGURATION_INVALID_MAX_POOL = "Invalid max pool";
    public static final String MASTER_CONFIGURATION_INVALID_MIN_POOL = "Invalid min pool";
    public static final String MASTER_CONFIGURATION_INVALID_MAX_POOL_QUEUE = "Invalid max pool queue";
    public static final String MASTER_CONFIGURATION_INVALID_SERVICEPORT = "Invalid service port";
    public static final String MASTER_CONFIGURATION_INVALID_SERVICE_READ_TIMEOUT = "Invalid service read time out";
    public static final String MASTER_CONFIGURATION_INVALID_NO_OF_LOG_FILES = "Invalid no of log files";
    public static final String MASTER_CONFIGURATION_EMPTY_LOG_BACKUP = "Invalid log backup";
    public static final String MASTER_CONFIGURATION_INVALID_LOG_LEVEL = "Invalid log level";
    public static final String MASTER_CONFIGURATION_EMPTY_BACKUP_STATUS = "Invalid backup status";
    public static final String MASTER_CONFIGURATION_EMPTY_VALIDATIONSTATUS = "Invalid validation status";
    //------------------------------- SWT Master configuration ---------------------------//

    //-------------------------------- SWT Service configuration -----------------------------//
    public static final String SERVICE_CONFIGURATION_EMPTY_NAME = "Enter name.";
    public static final String SERVICE_CONFIGURATION_INVALID_TIMEOUT = "Invalid time out";
    public static final String SERVICE_CONFIGURATION_EMPTY_STARUS = "Select status.";
    public static final String SERVICE_CONFIGURATION_INVALID_REQUEST_METHOD = "Invalid request method";
    public static final String SERVICE_CONFIGURATION_INVALID_REQUEST_PROPERTY_KEY = "Invalid request property key";
    public static final String SERVICE_CONFIGURATION_INVALID_REQUEST_PROPERTY_VALUE = "Invalid request property value";
    public static final String SERVICE_CONFIGURATION_EMPTY_URL = "Enter url.";
    //-------------------------------- SWT Service configuration -----------------------------//

    //----------------------------E-Switch Channel Configuration-------------------------//
    public static final String SWT_CHANNEL_CONFIGURATION_EMPTY_IP = "Enter IP.";
    public static final String SWT_CHANNEL_CONFIGURATION_INVALID_CONNECTION_TIMEOUT = "Invalid connection timeout";
    public static final String SWT_CHANNEL_CONFIGURATION_INVALID_NII = "Invalid NII";
    public static final String SWT_CHANNEL_CONFIGURATION_INVALID_PORT = "Invalid Port Number";
    public static final String SWT_CHANNEL_CONFIGURATION_INVALID_READ_TIMEOUT = "Invalid read timeout";
    public static final String SWT_CHANNEL_CONFIGURATION_EMPTY_STATUS = "Select status.";
    public static final String SWT_CHANNEL_CONFIGURATION_EMPTY_CONNECTION_TYPE = "Select connection type.";
    public static final String SWT_CHANNEL_CONFIGURATION_EMPTY_HEADER_SIZE = "Enter header size.";
    //----------------------------E-Switch Channel Configuration-------------------------//
    //----------------------------E-Switch Listner Configuration-------------------------//
    public static final String SWT_LISTNER_CONFIGURATION_EMPTY_UID = "Enter UID.";
    public static final String SWT_LISTNER_CONFIGURATION_INVALID_BLOCK_SIZE = "Invalid block size";
    public static final String SWT_LISTNER_CONFIGURATION_INVALID_PREFIX = "Invalid prefix";
    public static final String SWT_LISTNER_CONFIGURATION_INVALID_PORT = "Invalid Port Number";
    public static final String SWT_LISTNER_CONFIGURATION_INVALID_READ_TIMEOUT = "Invalid read timeout";
    public static final String SWT_LISTNER_CONFIGURATION_EMPTY_STATUS = "Select status.";
    public static final String SWT_LISTNER_CONFIGURATION_EMPTY_CONNECTION_TYPE = "Select connection type.";
    public static final String SWT_LISTNER_CONFIGURATION_EMPTY_HEADER_SIZE = "Enter header size.";
    //----------------------------E-Switch Channel Configuration-------------------------//
    //--------------------Holiday Management--------------------//
    public static final String HOLIDAY_MGT_EMPTY_YEAR = "Select year.";
    public static final String HOLIDAY_MGT_EMPTY_STATUS = "Select status.";
    public static final String COMMON_ERROR_ALRADY_AGENTOPARATEDAY = "This record is already in agent operate day. Cannot delete";
    //--------------------Holiday Management--------------------//

    //--------------------- Card Product Management --------------------//
    public static final String CARD_PRODUCT_MGT_EMPTY_PRODUCTCODE = "Enter product code.";
    public static final String CARD_PRODUCT_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String CARD_PRODUCT_MGT_EMPTY_DISPLAYNAME = "Enter display name.";
    public static final String CARD_PRODUCT_MGT_EMPTY_COLOR = "Select color.";
    public static final String CARD_PRODUCT_MGT_EMPTY_CARDTYPE = "Select card type.";
    public static final String CARD_PRODUCT_MGT_DELETE_NOT_ALLOWED = "Card product already assigned. Delete not allowed.";
    public static final String CARD_PRODUCT_MGT_COLOR_ALREADY_USED = "This color already used.";
    //--------------------- Card Product Management --------------------//
    //--------------------Wallet Management---------------//    
    public static final String WALLET_MGT_EMPTY_USERNAME = "Enter username.";
    public static final String WALLET_MGT_EMPTY_MOBILENO = "Enter valid mobile number.";
    public static final String WALLET_MGT_EMPTY_RISKPARAM = "Enter risk param.";
    public static final String WALLET_MGT_EMPTY_REMARK = "Enter remark.";
    public static final String WALLET_MGT_EMPTY_STATUS = "Select status.";
    public static final String WALLET_MGT_EMPTY_PIN = "Enter pin.";
    public static final String WALLET_MGT_EMPTY_COM_PIN = "Enter confirm pin.";
    public static final String WALLET_MGT_PASSWORDMISMATCH = "Pins mismatch";
    public static final String WALLET_MGT_TEMP_PINRESET = "pin requested to be changed.";
    public static final String WALLET_MGT_SUCC_PINRESET = "pin reset successfully.";
    //--------------------Wallet Management---------------//
    //--------------------District Management---------------//    
    public static final String DISTRICT_MGT_EMPTY_DISTRICTCODE = "Enter district code.";
    public static final String DISTRICT_MGT_EMPTY_COUNTRYCODE = "Empty country.";
    public static final String DISTRICT_MGT_EMPTY_PROVINCECODE = "Empty province.";
    public static final String DISTRICT_MGT_INVALID_DISTRICTCODE = "District code invalid.";
    public static final String DISTRICT_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String DISTRICT_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String DISTRICT_MGT_EMPTY_STATUS = "Select status.";
    public static final String DISTRICT_MGT_DELETE_NOT_ALLOWED = "District already assigned. Delete not allowed.";
    //--------------------District Management---------------//    
    //--------------------Case Category Management---------------//    
    public static final String CASE_CATEGORY_MGT_DELETE_NOT_ALLOWED = "Case category already assigned. Delete not allowed.";
    public static final String CASE_CATEGORY_MGT_EMPTY_CODE = "Enter case category code.";
    public static final String CASE_CATEGORY_MGT_INVALID_CODE = "Case category prefix invalid.";
    public static final String CASE_CATEGORY_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String CASE_CATEGORY_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String CASE_CATEGORY_MGT_EMPTY_STATUS = "Select status.";
    //--------------------Case Category Management---------------//
    //--------------------Case Type Management---------------//
    public static final String CASE_TYPE_MGT_DELETE_NOT_ALLOWED = "Case Type already assigned. Delete not allowed.";
    public static final String CASE_TYPE_MGT_EMPTY_BRANCHPREFIX = "Enter case type code.";
    public static final String CASE_TYPE_MGT_INVALID_BRANCHPREFIX = "Case Type code invalid.";
    public static final String CASE_TYPE_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String CASE_TYPE_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String CASE_TYPE_MGT_INVALID_CATEGORY = "Case Category invalid.";
    public static final String CASE_TYPE_MGT_EMPTY_STATUS = "Select status.";
    public static final String CASE_TYPE_MGT_EMPTY_CATEGORY = "Select case category.";
    //--------------------Case Type Management---------------//
    //--------------------Complain Category Management---------------//
    public static final String COMPLAIN_CAT_MGT_DELETE_NOT_ALLOWED = "Complain category already assigned. Delete not allowed.";
    public static final String COMPLAIN_CAT_MGT_EMPTY_CODE = "Enter complain category code.";
    public static final String COMPLAIN_CAT_MGT_INVALID_CODE = "Complain category code invalid.";
    public static final String COMPLAIN_CAT_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String COMPLAIN_CAT_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String COMPLAIN_CAT_EMPTY_STATUS = "Select status.";
    //--------------------Complain Category Management---------------//
    //--------------------COMPLAIN Type Management---------------//
    public static final String COMPLAIN_TYPE_MGT_DELETE_NOT_ALLOWED = "Complain type already assigned. Delete not allowed.";
    public static final String COMPLAIN_TYPE_MGT_EMPTY_BRANCHPREFIX = "Enter complain type code.";
    public static final String COMPLAIN_TYPE_MGT_INVALID_BRANCHPREFIX = "Complain type code invalid.";
    public static final String COMPLAIN_TYPE_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String COMPLAIN_TYPE_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String COMPLAIN_TYPE_MGT_INVALID_CATEGORY = "Complain Category invalid.";
    public static final String COMPLAIN_TYPE_MGT_EMPTY_STATUS = "Select status.";
    public static final String COMPLAIN_TYPE_MGT_EMPTY_CATEGORY = "Select complain category.";
    //--------------------COMPLAIN Type Management---------------//
    //--------------------MERCHANT CATEGORY CODE Type Management---------------//
    public static final String MCC_MGT_DELETE_NOT_ALLOWED = "Merchant category already assigned. Delete not allowed.";
    public static final String MCC_TYPE_MGT_EMPTY_CODE = "Enter case type code.";
    public static final String MCC_TYPE_MGT_INVALID_CODE = "Complain Type code invalid.";
    public static final String MCC_TYPE_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String MCC_TYPE_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String MCC_TYPE_MGT_INVALID_CATEGORY = "Merchant Category Code invalid.";
    public static final String MCC_TYPE_MGT_EMPTY_STATUS = "Select status.";

    //--------------------Province Management------------//
    public static final String PROVINCE_MGT_DELETE_NOT_ALLOWED = "Province already assigned. Delete not allowed.";
    public static final String PROVINCE_MGT_EMPTY_BRANCHPREFIX = "Enter province code.";
    public static final String PROVINCE_MGT_INVALID_BRANCHPREFIX = "Province code invalid.";
    public static final String PROVINCE_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String PROVINCE_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String PROVINCE_MGT_EMPTY_COUNTRY = "Select country.";
    public static final String PROVINCE_MGT_EMPTY_STATUS = "Select status.";
    //--------------------Province Management------------//

    //--------------------City Management------------//
    public static final String CITY_MGT_DELETE_NOT_ALLOWED = "City already assigned. Delete not allowed.";
    public static final String CITY_MGT_EMPTY_BRANCHPREFIX = "Enter city code.";
    public static final String CITY_MGT_INVALID_BRANCHPREFIX = "City code invalid.";
    public static final String CITY_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String CITY_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String CITY_MGT_EMPTY_STATUS = "Select status.";
    public static final String CITY_MGT_EMPTY_COUNTRY = "Select country.";
    public static final String CITY_MGT_EMPTY_PROVINCE= "Select province.";
    public static final String CITY_MGT_EMPTY_DISTRICT= "Select district.";
    //--------------------City Management------------//

    //--------------------TemrinalBrand Management------------//
    public static final String TERMINAL_BRAND_MGT_DELETE_NOT_ALLOWED = "Device brand already assigned. Delete not allowed.";
    public static final String TERMINAL_BRAND_MGT_EMPTY_BRANDCODE = "Enter brand code.";
    public static final String TERMINAL_BRAND_MGT_INVALID_BRANDCODE = "Brand code invalid.";
    public static final String TERMINAL_BRAND_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String TERMINAL_BRAND_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String TERMINAL_BRAND_MGT_EMPTY_STATUS = "Select status.";
    //--------------------TemrinalBrand Management------------//
    //--------------------MERCHANT CATEGORY CODE Type Management---------------//
    //--------------------Device Management---------------//
    public static final String DEVICE_MGT_DELETE_NOT_ALLOWED = "Device already assigned. Delete not allowed.";
    public static final String DEVICE_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String DEVICE_MGT_EMPTY_TERMINAL = "Enter terminal ID.";
    public static final String DEVICE_MGT_EMPTY_MERCHANT = "Select merchant.";
    public static final String DEVICE_MGT_EMPTY_CURRENCY = "Select currency.";
    public static final String DEVICE_MGT_INVALID_DESCRIPTION = "Description invalid.";
    public static final String DEVICE_MGT_INVALID_CATEGORY = "Merchant Category Code invalid.";
    public static final String DEVICE_MGT_EMPTY_TERMINAL_MODEL = "Select device model.";
    public static final String DEVICE_MGT_EMPTY_STATUS = "Select status.";
    public static final String DEVICE_MGT_ID = "Enter Id.";
    public static final String DEVICE_MGT_EMPTY_ASSERTID = "Enter asset ID.";
    public static final String DEVICE_MGT_EMPTY_IMEI = "Enter IMEI number.";
    public static final String DEVICE_MGT_EMPTY_MASTER_KEY = "Enter master key.";
    public static final String DEVICE_MGT_EMPTY_PASSCODE = "Enter pass code.";
    public static final String DEVICE_MGT_EMPTY_SERIAL_NUMBER = "Enter serial number.";
    public static final String DEVICE_MGT_EMPTY_SESSION_KEY = "Enter session key.";
    //--------------------Device Management---------------//
    //--------------------Customer Support Case Management------------//
    public static final String CUSTOMER_SUPPORT_CASE_EMPTY_CASECATEGORY = "Select case category.";
    public static final String CUSTOMER_SUPPORT_CASE_EMPTY_CASETYPE = "Select case type.";
    public static final String CUSTOMER_SUPPORT_CASE_EMPTY_DESCRIPTION = "Enter description.";
    public static final String CUSTOMER_SUPPORT_CASE_EMPTY_REMARK = "Enter remark.";
    public static final String CUSTOMER_SUPPORT_CASE_EMPTY_STATUS = "Select status.";
    public static final String CUSTOMER_SUPPORT_CASE_INVALID_STATUS = "Please change status.";
    //--------------------Customer Support Case Management------------//
    //--------------------Customer Support Management------------//
    public static final String CUSTOMER_SUPPORT_MGT_EMPTY_CASE = "Please assign at least one Case.";
    public static final String CUSTOMER_SUPPORT_MGT_ASSIGNED_PAGE = "Case(s) already assigned for the given Person.";
    //--------------------Customer Support Management------------//

    //--------------------Device Management---------------//
    public static final String NOTIFICATION_MGT_EMPTY_ID = "Enter id.";
    public static final String NOTIFICATION_MGT_INVALID_ID = "Notification id invalid.";
    public static final String NOTIFICATION_MGT_EMPTY_TYPE = "Select type.";
    public static final String NOTIFICATION_MGT_EMPTY_TITLE = "Enter title.";
    public static final String NOTIFICATION_MGT_EMPTY_DESCRIPTION = "Enter description.";
    public static final String NOTIFICATION_MGT_EMPTY_STATUS = "Select status.";
    public static final String NOTIFICATION_MGT_DELETE_NOT_ALLOWED = "Notification already assigned. Delete not allowed.";
    //--------------------Device Management---------------//
    //--------------------Complain Management---------------//
    public static final String COMPLAIN_MGT_EMPTY_COMPLAIN = "Enter complain.";
    public static final String COMPLAIN_MGT_EMPTY_STATUS = "Select status.";
    public static final String COMPLAIN_MGT_EMPTY_CASE_CATEGORY = "Select case category.";
        public static final String COMPLAIN_MGT_EMPTY_CASE_TYPE = "Select case type.";
    public static final String COMPLAIN_MGT_EMPTY_CASE_DESCRIPTION = "Enter case description.";
     public static final String COMPLAIN_MGT_EMPTY_REMARK = "Enter case remark.";

    //--------------------Complain Management---------------//
}

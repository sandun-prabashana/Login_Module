/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.util.varlist;

/**
 *
 * Document : CommonVarList Created on : Apr 17, 2013, 3:49:45 PM Author : Isuru
 * Ranasinghe
 */
public class CommonVarList {

    //---------start status category code-------//
    public static final String STATUS_CATEGORY_DEFULT = "DFA";
    public static final String STATUS_CATEGORY_AUTHENTICATION = "AUTH";
    public static final String STATUS_CATEGORY_PASSWORD = "PAS";
    public static final String STATUS_CATEGORY_CASE = "CASE";
    public static final String STATUS_CATEGORY_OPEN = "OPEN";
    public static final String STATUS_CATEGORY_TRANSACTION = "TXN";
    //---------end status category code-------//
    //-----------start status code------------//
    public static final String STATUS_ACTIVE = "ACT";
    public static final String STATUS_DEACTIVE = "DCT";
    public static final String STATUS_AUTH_PEN = "APEN";
    public static final String STATUS_AUTH_CON = "ACON";
    public static final String STATUS_AUTH_REJ = "AREJ";
    public static final String STATUS_NEW = "NEW";
    public static final String STATUS_RESET = "RES";
    public static final String STATUS_CHANGED = "CHA";
    public static final String STATUS_EXPIRED = "EXP";
    public static final String STATUS_OPEN = "OPEN";
    public static final String STATUS_ASSIGNED = "ASSIGNED";
    public static final String STATUS_PROCESSING = "PROC";
    public static final String STATUS_FIXED = "FIXED";
    public static final String STATUS_CLOSED = "CLOSED";
    public static final String STATUS_REOPEN = "REOPEN";
    public static final String STATUS_REASSIGN = "REASSIGN";
    public static final String STATUS_ASSIGN_TOVENDOR = "ASTOVEND";
    public static final String STATUS_TXN_SUCC_COMP = "TCMP";
    public static final String STATUS_TXN_CANCELLED = "TCNL";
    public static final String STATUS_TXN_SETTLED_SUCC_UPLD = "TUPD";
    public static final String STATUS_TXN_SETTLEMENT_STATUS = "TSET";
    //-----------end status code--------------//
    //-----------start String Split code------------//
    public static final String REGEXPRESSIONPIPE = "\\|";
    public static final String REGEXPRESSIONDOT = "\\.";
    //-----------end  String Split code--------------//
    //-----------start defalt login attems-----------//
    public static final Byte DEFALT_LOGIN_ATTEMS = 0;
    public static final Byte DEFALT_INIT_LOGIN_ATTEMPTS = 0;
    //-----------end defalt login attems-------------//
    //-----------start password param code ----------//
    public static final String PW_PARAM_IACT_TIME_PERIOD = "ITM";
    public static final String PW_PARAM_PIN_COUNT = "PIN";
    public static final String PW_PARAM_PW_AGE = "PAG";
    public static final String PW_PARAM_PW_HIS_KEEP = "PHI";
    //-----------end password param code ------------//
    //-----------start password paramter default values ----------//
    public static final int PWPARM_DEF_INACTTIME = 30;
    public static final int PWPARM_DEF_PIN_COUNT = 3;
    public static final int PWPARM_DEF_PW_AGE = 30;
    //-----------end password paramter default values ------------//
    //-----------start Operate Hour param code ----------//
    public static final String OH_PARAM_SRV_OPR_HR = "SVROPR";
    //-----------end Operate Hour param code ------------//
    //-----------start Terminal param code ----------//
    public static final String TERMINAL_PARAM_TERM_IDLE_TIME = "TRMIDL";
    public static final String TERMINAL_PARAM_MIN_PWD_LENGTH = "PASSL";
    public static final String TERMINAL_PARAM_INVAL_USR_ATTMP = "INATT";
    //-----------end Terminal param code ------------//
    //-----------start Unitcategory category code ----------//
    public static final String UNITCATEGORY_TERMINAL = "TERMNL";
    public static final String UNITCATEGORY_TXN = "TRANSN";
    public static final String UNITCATEGORY_TERMINAL_PASSWORD = "TERPASS";
    //-----------end Unitcategory category code ------------//
    //-----------start User Role Type code ----------//
    public static final String USERROLETYPE_WEB = "WEB";
    public static final String USERROLETYPE_POS = "POS";
    public static final String USERROLETYPE_MERCHANT = "MER";
    public static final String USERROLETYPE_MERCHANT_CUSTOMER = "MEC";
    public static final String USERROLETYPE_CUSTOMER_SUPPORT = "CSO";
    //-----------end User Role Type code ------------//
    //-----------start Agent User Login Status----------//
    public static final String AGENTUSER_SIGNED_IN = "Signed In";
    public static final String AGENTUSER_MANUALLY_SIGNED_OFF = "Manually Signed Off";
    public static final String AGENTUSER_SIGNED_OFF = "Signed Off";
    //-----------end Agent User Login Status ------------//
    //-----------start Terminal Login Status----------//
    public static final String TERMINAL_SIGNED_IN = "Signed In";
    public static final String TERMINAL_SIGNED_OFF = "Signed Off";
    public static final byte TERMINAL_LOGIN_FLAG_SIGNED_IN = 1;
    public static final byte TERMINAL_LOGIN_FLAG_SIGNED_OFF = 0;
    //-----------end Terminal Login Status ------------//
    //-----------start TIMESTAMP PER DAY ----------//
    public static final long TIMESTAMPVALUE_PERDAY = 86400000l;
    //-----------end TIMESTAMP PER DAY ------------//
    //-----------start home Summary types ----------//
    public static final String SUMMARY_TOT_AGENTS = "Total number of active agents";
    public static final String SUMMARY_TOT_TERMINALS = "Total number of active terminals";
    public static final String SUMMARY_TOT_TXNS = "Total number of transactions";
    public static final String SUMMARY_TOT_TXNAMOUNT = "Total transaction amount";
    //-----------end home Summary types ------------//
    //-----------start home status types ----------//
    public static final String STAT_DB_STATUS = "Database Status";
    public static final String STAT_ESWITCH_STATUS = "Epic Switch Status";
    public static final String STAT_TXNS_TODAY = "Total number of transactions- Today";
    public static final String STAT_STATUS_RUNNING = "Running";
    public static final String STAT_STATUS_UNAVAILABLE = "Unavailable";
    //-----------end home status types ------------//
    //-----------start transactiontypecode ----------//
    public static final String TXNTYPE_DEPOSIT = "DEPO";
    public static final String TXNTYPE_WITHDROW = "WITH";
    public static final String TXNTYPE_SALE = "SALE";
    public static final String TXNTYPE_OFFLINE_SALE = "OFLI";
    public static final String TXNTYPE_VOID = "VOID";
    public static final String TXNTYPE_REFUND = "RFUD";
    public static final String TXNTYPE_CASH_ADVANCE = "CAVN";
    public static final String TXNTYPE_CASH_INSTALLMENT = "CISM";
    public static final String TXNTYPE_PRE_AUTH_COMPLETE = "PACM";
    public static final String TXNTYPE_VOID_REVERSAL = "VRVL";
    public static final String TXNTYPE_REVERSAL = "RVSL";
    public static final String TXNTYPE_ACCOUNT_OPEN = "02";
    public static final String TXNTYPE_CREATE_NOTEPAD = "12";
    public static final String TXNTYPE_COLLECTION = "03";
    //-----------end transactiontypecode ------------//
    //-----------start homepage ----------//
    public static final String HOME_PAGENAME = "Home";
    //-----------end homepage ------------//
    //-----------start App version ----------//
    public static final String APP_VERSION = "V 1.11";
    //-----------end App version ------------//
    //-----------start EPIC SWITCH STATUS CHECK ----------//
    public static final String EPIC_SWITCH_STATUS_ONLINE = "Online";
    public static final String EPIC_SWITCH_STATUS_OFFLINE = "Offline";
    //-----------end EPIC SWITCH STATUS CHECK  ------------//
    //-----------start Epic login----------//
    public static final String SYSTEMUSERNAME = "epicadmin";
    public static final String SUPERUSER = "SUPERADMIN";
    public static final String SYSTEMUSERPWD = "a1f70cc914f08316de2035c6a886a53477ac56fb";//epic#admin123
    //-----------end Epic login ------------//
    //-----------start Page Management page detais----------//
    public static final String PAGEMGT_PAGE_DESCRIPTION = "Page Management";
    public static final String PAGEMGT_PAGE_URL = "ViewPage";
    //-----------end Page Management page detais------------//    
    //-----------start Transaction Type----------//
    public static final String TXNTYPE_MGT_TXNTYPE_PADW = "PADW";
    //-----------end Transaction Type------------// 
    //-----------start JNDI----------//
    public static String JNDINAME = "java:/mvisaJNDI";
    //-----------end JNDI------------// 
    //-----------start SAMPATH service properies----------//
    public static final String SAMPATH_SRVC_CLIENTID = "SMRTMTRO";
    public static final String SAMPATH_SRVC_PWD = "A3*s&7%M";
    public static final String SAMPATH_SRVC_URL = "http://192.125.125.176/etkWS/EtkService.asmx";
    public static final String SAMPATH_SRVC_RESPONSE_SUCESS = "00";
    //-----------end SAMPATH service properies------------// 
    //-----------start Agent Category ---------//
    public static final String AGENT_CATEGORY_DEFAULT = "DEFAULT";
    //-----------end Agent Category ------------// 
    //-----------start Branch ---------//
    public static final String BRANCH_DEFAULT = "DEFAULT";
    //-----------end Branch ------------// 
    //---------start common values---------//
    public static final String EMPTY_OR_NULL_REPLACE_VALUE = "--";
    public static final String EMPTY_OR_NULL_REPLACE_VALUE_ALL = "-All-";
    public static final String EMPTY_OR_NULL_REPLACE_VALUE_NA = "-N/A-";
    //---------end common values---------//
    //-----------start Agent Category ---------//
    public static final int TERMINAL_IMEI_LENGTH = 15;
    //-----------end Agent Category ------------// 
    //-----------start transaction response properies----------//
    public static final String TXN_RESPONSE_SUCESS = "00";
    //-----------end transaction response properies------------// 
    //-----------start unit------------//
    public static final String UNIT_DIGITS = "DIGITS";
    public static final String UNIT_ATTMPT = "ATTMPT";
    //-----------end unit--------------//
    public static final int TERMINAL_LOCATION_HISTORY_NO = 10;
    //-----------start eswitch header--------//
    public static final String ESWITCH_CHANNEL_TYPE_ONE = "01";
    public static final String ESWITCH_FUNCTION_CODE_ACC_OPEN = "09";
    //-----------start eswitch header--------//
    //-----------start switch channel configutarion------//
    public static final String ESWITCH_CHANNEL_NAME = "SWITCH";
    //-----------end switch channel configutarion--------//
    public static final String PARAMETER_TYPE_ALL = "ALL";
    public static final String ESWITCH_TIMEOUT = "30000";
    //-----------start switch response code ----------//
    public static final String ESWITCH_RESPONSE_SUCCESS = "00";
    public static final String ESWITCH_RESPONSE_FAIL = "01";
    public static final String ESWITCH_SOCKET_TIMEOUT = "STE";
    //-----------start switch response code ----------//

    //-----------start configurations values------------------//
    public static String ESWITCH_LISTNER_IP;
    public static String ESWITCH_LISTNER_PORT;
    public static String ESWITCH_HEADER;
    public static String ESWITCH_ECHO_HEADER;
    //-----------end configurations values--------------------//
    //-----------start property file path------------------//
    public static String PROPERTY_FILE_PATH = "/opt/prop/config.properties";
    //-----------end property file path------------------//
    //-----------start report source file paths------------------//
    public static final String REPORT_LOGO_PATH = "/resources/assets/image/epicLogo.png";
    //-----------end report source file paths------------------//
    //----------- start common_param  paramtype ------------------//
    public static String COMMON_PARAM_PARAMTYPE_FTY = "FTY";
    public static String COMMON_PARAM_PARAMTYPE_ID_TYPE = "ITY";
    public static String COMMON_PARAM_PARAMTYPE_STATEMENT_CYCLE = "STC";
    public static String COMMON_PARAM_PARAMTYPE_ACCOUNT_TYPE = "ATY";
    public static String COMMON_PARAM_PARAMTYPE_CARD_TYPE = "CTY";
    public static String COMMON_PARAM_PARAMTYPE_TIP_TYPE = "TTI";
    public static String COMMON_PARAM_ADDITIONAL_CONSUMER_DATA_REQUEST = "ACDR";
    //----------- end common_param  paramtype ------------------//
    public static final String COMMON_PARAMS_USER_TYPE = "UTY";

    //-----------start merchantprofile values------------------//
    public static String MERCHANT_PROFILE_TYPE = "MPTY";
    //-----------end merchantprofile values------------------//
    //-----------start merchant type values------------------//
    public static String MERCHANT_TYPE_STRUCTURED = "Structured";
    public static String MERCHANT_TYPE_UNSTRUCTURED = "Unstructured";
    //-----------end merchant type values------------------//
    //---------start status category code-------//
    public static final String COMMON_PARAM_MERCHANT_TYPE_CODE = "MPTY";
    public static final String COMMON_PARAM_ACCOUNT_TYPE_CODE = "ATY";
    public static final String COMMON_PARAM_PAYMENT_CYCLE_TYPE_CODE = "PYC";
    public static final String COMMON_PARAM_STATEMENT_CYCLE_TYPE_CODE = "STC";
    //---------end status category code-------//
    //---------start channel type code-------//
    public static final String PARAM_TYPE_CHANNEL = "CHAN";
    public static final String CHANNEL_TYPE_MOBILE = "MOB";
    public static final String CHANNEL_TYPE_WEB = "WEB";
    //---------end channel type code-------//
    //---------start refference type code-------//
    public static final String DOCUMENT_REF_TYPE_MERCHANT = "MID";
    public static final String DOCUMENT_REF_TYPE_MERCHANT_TMP = "TMID";
    public static final String DOCUMENT_REF_TYPE_CUSTOMER = "CID";
    public static final String TERMS_TYPE_CUSTOMER = "CUSTOMER";
    public static final String TERMS_TYPE_MERCHANT = "MERCHANT";
    //---------end refference type code-------//
    //-----------start Bin Range ---------//
    public static final String BINRANGE_ONUS = "On-us";
    public static final String BINRANGE_OFFUS = "Off-us";
    public static final String BINRANGE_ACQUIRE = "Acquirere";
    public static final String BINRANGE_ISSUER = "Issuer";
    //-----------end Bin range ------------// 
    //-----------start QR generation ---------//
    public static final String QR_PAYLOAD_FORMAT_INDICATOR = "01";
    public static final String QR_STATIC_CODE = "11";
    public static final String QR_DYNAMIC_CODE = "12";
    //-----------end QR generation ------------//
    public static final String PAGE_CODE_LIST_OF_PORTALS = "'MMCP','MUMCP','MTMCP','MUMP','MTMP','QRMCP','QRMP'";
    //-----------start notification types ------------//
    public static final String NOTIFICATION_VIA_SMS = "sms";
    public static final String NOTIFICATION_VIA_PUSH = "push";
    public static final String NOTIFICATION_VIA_BOTH = "both";
    public static final String BOOLEAN_TRUE = "true";
    public static final String BOOLEAN_FALSE = "false";
    //-----------Merchant Pan--------------//
    //-----------start tip types ------------//
    public static final String TIP_TYPE_CONSUMER = "01";
    public static final String TIP_TYPE_FIXED = "02";
    public static final String TIP_TYPE_PERCENTAGE = "03";
    //-----------end tip types ------------//
    public static final int MERCHNAT_PAN_LENGTH = 16;
    public static final int SWT_MASTER_CONFIGURATION_ID = 1;

    public static String DAY_OF_WEEK_SATURDAY = "Saturday";
    public static String DAY_OF_WEEK_SUNDAY = "Sunday";

    public static final String CALCULATION_TYPE_FLAT = "Flat";
    public static final String CALCULATION_TYPE_PERCENTAGE = "Percentage";
    public static final String SLABS_TYPE_NO_OF_TRANSACTIONS = "No of Transactions";
    public static final String SLABS_TYPE_TIER_WISE_AMOUNT = "Tier Wise Amount";

    //---------------terminal status----------//
    public static String TERMINAL_STATUS_ACTIVE = "Active";
    public static String TERMINAL_STATUS_DEACTIVE = "De-Active";
    
    //---------------Module URLs----------//
    public static String ADMIN_URL;
    public static String TMS_URL;
    
    //---------------Login Flag----------//
    public static final int LOG_IN = 1;
    public static final int LOG_OFF = 0;
    
    //---------------Context Parameters----------//
    public static String PATH_ROOT;
    public static String DB_CONFIG;
    
     //--------------Static User-------------//
    public static String SYSUSER;
}

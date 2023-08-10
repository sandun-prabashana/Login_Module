/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.atemlogin.util.varlist;

/**
 *
 * Document : SQLVarList Created on : 08/05/2013,14:31:29 Author : Amila
 * Jayasekara
 *
 */
public class SQLVarList {

    public static final String MYSQL_GET_SYSTIME_SQL = "SELECT DATE_FORMAT(NOW(), '%Y-%m-%d %H:%i:%s') DATE";
    public static final String MSSQL_GET_SYSTIME_SQL = "select convert(varchar(19), getdate(), 120)";
    public static final String ORACLE_GET_SYSTIME_SQL = "select to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') as a from dual";
    public static final String MYSQL_GET_SYSTEM_STATUS = "select '1'";
    public static final String MYSQL_AUDITTRACE_SEACRH_SQL1 = "select "
            + "count(a.audittraceid) "
            + " From audittrace a"
            + " left outer join userrole ur on a.userrolecode=ur.userrolecode "
            + " left outer join page p on a.pagecode=p.pagecode "
            + " left outer join task t on a.taskcode=t.taskcode"
            + " where ";
    public static final String MYSQL_AUDITTRACE_SEACRH_SQL2 = "select "
            + "a.audittraceid,"//0
            + "a.description,"//1
            + "a.remarks,"//2
            + "a.ip,"//3
            + "a.oldvalue,"//4
            + "a.newvalue,"//5
            + "a.lastupdateduser,"//6
            + "date_format(a.lastupdatedtime,'%Y-%m-%d %H:%i:%s') as lastupdatedtime, "//7
            + "date_format( a.createdtime,'%Y-%m-%d %H:%i:%s') as createdtime, "//8
            + "a.affectedkey,"//9
            + "ur.userrolecode as userrolecode,"//10
            + "ur.description as userroledes,"//11
            + "p.pagecode as pagecode,"//12
            + "p.description as pagedes,"//13
            + "t.description as taskdes "//14        
            + " From audittrace a"
            + " left outer join userrole ur on a.userrolecode=ur.userrolecode "
            + " left outer join page p on a.pagecode=p.pagecode "
            + " left outer join task t on a.taskcode=t.taskcode"
            + " where ";

    public static final String MYSQL_EDIT_BRANCH_SQL = "select "
            + "b.branchprifix, "
            + "b.description "
            + "from branch as b "
            + "full outer join agent as a on a.branch = b.branchprifix "
            + "where b.status =:status ";

    public static String MSSQL_FIND_ASSIGNED_MERCHANTS = "select m.merchantid,m.description "
            + "from merchant as m "
            + "left outer join merchantcustomer as mc on mc.id = m.merchantcustomer "
            + "where m.merchantid in "
            + "(select m.merchantid "
            + "from merchant as m "
            + "left outer join merchantnotification as mn on m.merchantid=mn.merchant "
            + "left outer join notification as n on n.id=mn.notification "
            + "left outer join merchantcustomer as mc on mc.id = m.merchantcustomer "
            + "where "
            + "mn.notification=:notificationid and "
            + "mc.id =:merchantcustomerid) and "
            + "mc.id =:merchantcustomerid";

    public static String MSSQL_FIND_UNASSIGNED_MERCHANTS = "select m.merchantid,m.description "
            + "from merchant as m "
            + "left outer join merchantcustomer as mc on mc.id = m.merchantcustomer "
            + "where m.merchantid not in "
            + "(select m.merchantid "
            + "from merchant as m "
            + "left outer join merchantnotification as mn on m.merchantid=mn.merchant "
            + "left outer join notification as n on n.id=mn.notification "
            + "left outer join merchantcustomer as mc on mc.id = m.merchantcustomer "
            + "where "
            + "mn.notification=:notificationid and "
            + "mc.id =:merchantcustomerid) and "
            + "mc.id =:merchantcustomerid";

    public static final String MYSQL_TXN_SEACRH_SQL1 = "select"
            + " count(t.transactionid)"
            + " From transaction t"
            + " left outer join merchant m on t.merchant = m.merchantid "
            //            + " left outer join terminal mt on mt.terminalid=t.terminalid and t.merchant=mt.merchant "
            + " left outer join transactiontype tt on t.transactiontype=tt.transactiontypecode "
            + " left outer join bank b on t.bank=b.bankcode "
            + " left outer join status s on t.status = s.statuscode"
            + " where ";

    public static final String MYSQL_TXN_SEACRH_SQL2 = "select "
            + "t.transactionid,"//0
            + "t.cardno, "//1
            + "t.transactiontype,"//2    
            + "tt.description as txndesc,"//3
            + "t.invoiceno,"//4
            + "t.amount,"//5
            + "t.terminalid,"//6
            + "t.merchant,"//7
            + "m.description as merchantdes,"//8
            + "t.approvecode,"//9      
            + "t.retrivelreffrencenumber,"//10
            + "t.tracenumber,"//11
            + "t.responcecode,"//12
            + "t.batchid,"//13
            + "t.status,"//14
            + "s.description as statusdescription,"//15
            + "date_format( t.createtime,'%Y-%m-%d %H:%i:%s') as createtime, "//16
            + "sn.signature,"//17
            + "b.description, "//18
            + "t.settlment_status, "//19
            + "t.txndate, "//20
            + "t.txntime"//21
            + " From transaction t"
            + " left outer join merchant m on m.merchantid=t.merchant "
            + " left outer join signature sn on sn.transactionid = t.transactionid"
//            + " left outer join terminal mt on mt.terminalid=t.terminalid and t.merchant=mt.merchant"
            + " left outer join transactiontype tt on tt.transactiontypecode=t.transactiontype "
            + " left outer join bank b on b.bankcode=t.bank "
            + " left outer join status s on s.statuscode=t.status "
            + " where ";

    public static final String MYSQL_TXN_SEACRH_TXN_SUM_QUERY = "select"
            + " sum(t.amount)"
            + " From transaction t"
            + " left outer join merchant m on m.merchantid=t.merchant "
//            + " left outer join terminal mt on mt.terminalid=t.terminalid and t.merchant=mt.merchant"
            + " left outer join transactiontype tt on tt.transactiontypecode=t.transactiontype "
            + " left outer join status s on s.statuscode=t.status "
            + " where ";

    public static final String MYSQL_TXN_SEACRH_TXN_SUM_QUERY_TYPE_WISE = "select "
            + " format(sum(if(T.TXNTYPE='" + CommonVarList.TXNTYPE_SALE + "',  T.TRANSACTIONCOUNT, '0')),0)            AS SALECOUNT,"//0
            + " format(sum(if(T.TXNTYPE='" + CommonVarList.TXNTYPE_SALE + "',  T.TOTALAMOUNT, '0.00')), 2)             AS SALEAMOUNT,"//1
            + " format(sum(if(T.TXNTYPE='" + CommonVarList.TXNTYPE_OFFLINE_SALE + "',  T.TRANSACTIONCOUNT, '0')),0)     AS OFLICOUNT,"//2
            + " format(sum(if(T.TXNTYPE='" + CommonVarList.TXNTYPE_OFFLINE_SALE + "',  T.TOTALAMOUNT, '0.00')), 2)      AS OFLIAMOUNT,"//3
            + " format(sum(if(T.TXNTYPE='" + CommonVarList.TXNTYPE_VOID + "',  T.TRANSACTIONCOUNT, '0')),0)             AS VOIDCOUNT,"//4
            + " format(sum(if(T.TXNTYPE='" + CommonVarList.TXNTYPE_VOID + "',  T.TOTALAMOUNT, '0.00')), 2)              AS VOIDAMOUNT,"//5
            + " format(sum(if(T.TXNTYPE='" + CommonVarList.TXNTYPE_CASH_ADVANCE + "',  T.TRANSACTIONCOUNT, '0')),0)	AS CAVNCOUNT,"//6
            + " format(sum(if(T.TXNTYPE='" + CommonVarList.TXNTYPE_CASH_ADVANCE + "',  T.TOTALAMOUNT, '0.00')), 2) 	AS CAVNAMOUNT,"//7
            + " format(sum(if(T.TXNTYPE='" + CommonVarList.TXNTYPE_CASH_INSTALLMENT + "',  T.TRANSACTIONCOUNT, '0')),0)	AS CISMCOUNT,"//8
            + " format(sum(if(T.TXNTYPE='" + CommonVarList.TXNTYPE_CASH_INSTALLMENT + "',  T.TOTALAMOUNT, '0.00')), 2) 	AS CISMAMOUNT,"//9
            + " format(sum(if(T.TXNTYPE='" + CommonVarList.TXNTYPE_REFUND + "',  T.TRANSACTIONCOUNT, '0')),0)           AS RFUDCOUNT,"//10
            + " format(sum(if(T.TXNTYPE='" + CommonVarList.TXNTYPE_REFUND + "',  T.TOTALAMOUNT, '0.00')), 2)            AS RFUDAMOUNT"//11
            + " from (select"
            + " t.transactiontype	   as TXNTYPE,"
            + " count(t.transactionid)    as TRANSACTIONCOUNT,"
            + " sum(t.amount)             as TOTALAMOUNT"
            + " from transaction as t"
            + " inner join  merchant as m on m.merchantid = t.merchant"
            + " left outer join status as s on t.status =  s.statuscode"
            + " left outer join transactiontype as ty on  t.transactiontype = ty.transactiontypecode"
            + " where txnwhere"
            + " group by"
            + " t.transactiontype) T";

    public static final String MYSQL_MERCHANT_TRANSACTION_SUMMARY_REPORT_COUNT_QUERY = "select "
            + "count(t.transactionid) "
            + " From transaction t"
            + " left outer join merchant m on m.merchantid=t.merchant "
//            + " left outer join terminal mt on mt.terminalid=t.terminalid and t.merchant=mt.merchant"
            + " left outer join transactiontype tt on tt.transactiontypecode=t.transactiontype "
            + " left outer join status s on s.statuscode=t.status "
            + " where t.responcecode='" + CommonVarList.TXN_RESPONSE_SUCESS + "'";

    public static final String MYSQL_MERCHANT_TRANSACTION_SUMMARY_REPORT_MERCANT_COUNT_QUERY = "select "
            + "count(distinct(t.merchant)) "
            + " From transaction t"
            + " left outer join merchant m on m.merchantid=t.merchant "
//            + " left outer join terminal mt on mt.terminalid=t.terminalid and t.merchant=mt.merchant"
            + " left outer join transactiontype tt on tt.transactiontypecode=t.transactiontype "
            + " left outer join status s on s.statuscode=t.status "
            + " where t.responcecode='" + CommonVarList.TXN_RESPONSE_SUCESS + "'";

    public static final String MYSQL_MERCHANT_TRANSACTION_SUMMARY_REPORT_QUERY = "select "
            + "t.transactionid,"//0
            + "t.processingcode, "//1
            + "t.transactiontype,"//2    
            + "tt.description as txndesc,"//3
            + "t.nii,"//4
            + "t.invoiceno,"//5
            + "t.amount,"//6 
            + "t.mti,"//7
            + "t.terminalid,"//8
            + "t.merchant,"//9
            + "m.description as merchantdes,"//10
            + "t.approvecode,"//11         
            + "t.retrivelreffrencenumber,"//12
            + "t.tracenumber,"//13
            + "t.batchid,"//14
            + "t.responcecode,"//15
            + "t.tlestatus,"//16
            + "t.settlment_status,"//17
            + "t.settlment_time,"//18
            + "t.status,"//19
            + "s.description as statusdescription,"//20
            + "t.cardno,"//21
            + "date_format( t.createtime,'%Y-%m-%d %H:%i:%s') as createtime, "//22
            + "tt.transactiontypecode,"//23   
            + "t.txndate,"//24  
            + "t.txntime "//25  
            + " from transaction t"
            + " left outer join merchant m on m.merchantid=t.merchant "
//            + " left outer join terminal mt on mt.terminalid=t.terminalid and t.merchant=mt.merchant"
            + " left outer join transactiontype tt on tt.transactiontypecode=t.transactiontype "
            + " left outer join status s on s.statuscode=t.status "
            + " where t.responcecode='" + CommonVarList.TXN_RESPONSE_SUCESS + "'";

    public static final String MYSQL_MERCHANT_TRANSACTION_SUMMARY_REPORT_QUERY_TXNTYPE_WISE = "select "
            + " format(sum(if(t.txntype='" + CommonVarList.TXNTYPE_SALE + "',  t.transactioncount, '0')),0)                 as salecount,"//0
            + " format(sum(if(t.txntype='" + CommonVarList.TXNTYPE_SALE + "',  t.totalamount, '0.00')), 2)                  as saleamount,"//1 
            + " format(sum(if(t.txntype='" + CommonVarList.TXNTYPE_OFFLINE_SALE + "',  t.transactioncount, '0')),0)         as oflicount,"//2
            + " format(sum(if(t.txntype='" + CommonVarList.TXNTYPE_OFFLINE_SALE + "',  t.totalamount, '0.00')), 2)          as ofliamount,"//3
            + " format(sum(if(t.txntype='" + CommonVarList.TXNTYPE_VOID + "',  t.transactioncount, '0')),0)                 as voidcount,"//4
            + " format(sum(if(t.txntype='" + CommonVarList.TXNTYPE_VOID + "',  t.totalamount, '0.00')), 2)                  as voidamount,"//5
            + " format(sum(if(t.txntype='" + CommonVarList.TXNTYPE_CASH_ADVANCE + "',  t.transactioncount, '0')),0)         as cavncount,"//6
            + " format(sum(if(t.txntype='" + CommonVarList.TXNTYPE_CASH_ADVANCE + "',  t.totalamount, '0.00')), 2)          as cavnamount,"//7
            + " format(sum(if(t.txntype='" + CommonVarList.TXNTYPE_CASH_INSTALLMENT + "',  t.transactioncount, '0')),0)     as cismcount,"//8
            + " format(sum(if(t.txntype='" + CommonVarList.TXNTYPE_CASH_INSTALLMENT + "',  t.totalamount, '0.00')), 2)      as cismamount,"//9
            + " format(sum(if(t.txntype='" + CommonVarList.TXNTYPE_PRE_AUTH_COMPLETE + "',  t.transactioncount, '0')),0)     as pacmcount,"//10
            + " format(sum(if(t.txntype='" + CommonVarList.TXNTYPE_PRE_AUTH_COMPLETE + "',  t.totalamount, '0.00')), 2)      as pacmamount,"//11
            + " format(sum(if(t.txntype='" + CommonVarList.TXNTYPE_REFUND + "',  t.transactioncount, '0')),0)               as rfudcount,"//12
            + " format(sum(if(t.txntype='" + CommonVarList.TXNTYPE_REFUND + "',  t.totalamount, '0.00')), 2)                as rfudamount,"//13
            + " t.merchantid as merchantid"//14
            + " from"
            + " (select"
            + " ifnull(t.merchant, '--')  as merchantid,"
            + " t.transactiontype         as txntype,"
            + " count(t.transactionid)    as transactioncount,"
            + " sum(t.amount)             as totalamount"
            + " from transaction as t"
            + " inner join merchant as m on m.merchantid = t.merchant"
            + " left outer join status as s on t.status =  s.statuscode"
            + " left outer join transactiontype as ty on  t.transactiontype = ty.transactiontypecode"
            + " where t.responcecode='" + CommonVarList.TXN_RESPONSE_SUCESS + "'";

    public static final String MYSQL_MERCHANT_TRANSACTION_MERCHANT_COUNT_QUERY = "select "
            + "count(distinct(t.merchant)) as merchantcount "
            + " from transaction t"
            + " left outer join merchant m on m.merchantid=t.merchant "
            + " left outer join terminal mt on mt.terminalid=t.terminalid and t.merchant=mt.merchant"
            + " left outer join transactiontype tt on tt.transactiontypecode=t.transactiontype "
            + " left outer join status s on s.statuscode=t.status "
            + " where t.responcecode='" + CommonVarList.TXN_RESPONSE_SUCESS + "'";

    public static final String MYSQL_TXN_RECEIPT_SQL = "select "
            + "t.transactionid,"//0
            + "t.txndate, "//1
            + "t.txntime,"//2    
            + "t.merchant,"//3
            + "t.terminalid,"//4
            + "t.batchid,"//5
            + "t.invoiceno,"//6
            + "t.cardno,"//7
            + "t.approvecode,"//8   
            + "t.retrivelreffrencenumber,"//9
            + "t.amount,"//10
            + "s.signature, "//11
            + "mc.mobilelogo, "//12
            + "mc.legalname, "//13
            + "m.address, "//14
            + "t.settlment_status "//15
            + " From transaction t"
            + " left outer join merchant m on m.merchantid=t.merchant "
            + " left outer join merchantcustomer mc on mc.id=m.merchantcustomer "
            + " left outer join signature s on s.transactionid=t.transactionid "
            + " where ";

}

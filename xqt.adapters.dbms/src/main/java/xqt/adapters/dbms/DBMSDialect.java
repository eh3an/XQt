/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xqt.adapters.dbms;

/**
 *
 * @author Javad Chamanara <chamanara@gmail.com>
 */
public enum DBMSDialect {
    PostgreSQL(1),
    MSSQL(2),
    MySQL5(4);
    private final int value;
    private DBMSDialect(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    public static DBMSDialect getEnum(int index){
        return DBMSDialect.values()[index];
    }
}

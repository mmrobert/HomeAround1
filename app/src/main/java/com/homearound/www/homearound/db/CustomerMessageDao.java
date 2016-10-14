package com.homearound.www.homearound.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.homearound.www.homearound.db.CustomerMessage;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CUSTOMER_MESSAGE".
*/
public class CustomerMessageDao extends AbstractDao<CustomerMessage, Long> {

    public static final String TABLENAME = "CUSTOMER_MESSAGE";

    /**
     * Properties of entity CustomerMessage.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Direction = new Property(1, String.class, "direction", false, "DIRECTION");
        public final static Property Email = new Property(2, String.class, "email", false, "EMAIL");
        public final static Property Messagebody = new Property(3, String.class, "messagebody", false, "MESSAGEBODY");
        public final static Property Messagetime = new Property(4, String.class, "messagetime", false, "MESSAGETIME");
        public final static Property Name = new Property(5, String.class, "name", false, "NAME");
    };


    public CustomerMessageDao(DaoConfig config) {
        super(config);
    }
    
    public CustomerMessageDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CUSTOMER_MESSAGE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"DIRECTION\" TEXT," + // 1: direction
                "\"EMAIL\" TEXT," + // 2: email
                "\"MESSAGEBODY\" TEXT," + // 3: messagebody
                "\"MESSAGETIME\" TEXT," + // 4: messagetime
                "\"NAME\" TEXT);"); // 5: name
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CUSTOMER_MESSAGE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, CustomerMessage entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String direction = entity.getDirection();
        if (direction != null) {
            stmt.bindString(2, direction);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(3, email);
        }
 
        String messagebody = entity.getMessagebody();
        if (messagebody != null) {
            stmt.bindString(4, messagebody);
        }
 
        String messagetime = entity.getMessagetime();
        if (messagetime != null) {
            stmt.bindString(5, messagetime);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(6, name);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public CustomerMessage readEntity(Cursor cursor, int offset) {
        CustomerMessage entity = new CustomerMessage( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // direction
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // email
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // messagebody
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // messagetime
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // name
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, CustomerMessage entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDirection(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setEmail(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setMessagebody(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setMessagetime(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(CustomerMessage entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(CustomerMessage entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
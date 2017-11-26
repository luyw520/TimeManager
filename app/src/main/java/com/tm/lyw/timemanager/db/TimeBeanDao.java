package com.tm.lyw.timemanager.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "t_time_info".
*/
public class TimeBeanDao extends AbstractDao<TimeBean, Void> {

    public static final String TABLENAME = "t_time_info";

    /**
     * Properties of entity TimeBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Time = new Property(0, String.class, "time", false, "time");
        public final static Property Type = new Property(1, int.class, "type", false, "type");
        public final static Property Date = new Property(2, long.class, "date", false, "date");
        public final static Property SortIndex = new Property(3, int.class, "sortIndex", false, "sortIndex");
    };


    public TimeBeanDao(DaoConfig config) {
        super(config);
    }
    
    public TimeBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"t_time_info\" (" + //
                "\"time\" TEXT," + // 0: time
                "\"type\" INTEGER NOT NULL ," + // 1: type
                "\"date\" INTEGER NOT NULL ," + // 2: date
                "\"sortIndex\" INTEGER NOT NULL );"); // 3: sortIndex
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"t_time_info\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TimeBean entity) {
        stmt.clearBindings();
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(1, time);
        }
        stmt.bindLong(2, entity.getType());
        stmt.bindLong(3, entity.getDate());
        stmt.bindLong(4, entity.getSortIndex());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TimeBean entity) {
        stmt.clearBindings();
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(1, time);
        }
        stmt.bindLong(2, entity.getType());
        stmt.bindLong(3, entity.getDate());
        stmt.bindLong(4, entity.getSortIndex());
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public TimeBean readEntity(Cursor cursor, int offset) {
        TimeBean entity = new TimeBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // time
            cursor.getInt(offset + 1), // type
            cursor.getLong(offset + 2), // date
            cursor.getInt(offset + 3) // sortIndex
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TimeBean entity, int offset) {
        entity.setTime(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setType(cursor.getInt(offset + 1));
        entity.setDate(cursor.getLong(offset + 2));
        entity.setSortIndex(cursor.getInt(offset + 3));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(TimeBean entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(TimeBean entity) {
        return null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}

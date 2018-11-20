package com.qingyun.download.greenDao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig downLoadRequestDaoDaoConfig;

    private final DownLoadRequest downLoadRequest;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        downLoadRequestDaoDaoConfig = daoConfigMap.get(DownLoadRequest.class).clone();
        downLoadRequestDaoDaoConfig.initIdentityScope(type);

        downLoadRequest = new DownLoadRequest(downLoadRequestDaoDaoConfig, this);

        registerDao(com.qingyun.download.DownLoadRequestDao.class, downLoadRequest);
    }
    
    public void clear() {
        downLoadRequestDaoDaoConfig.clearIdentityScope();
    }

    public DownLoadRequest getDownLoadRequest() {
        return downLoadRequest;
    }

}
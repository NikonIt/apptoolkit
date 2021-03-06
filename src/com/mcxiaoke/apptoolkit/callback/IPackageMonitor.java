package com.mcxiaoke.apptoolkit.callback;

/**
 * Project: appmanager
 * User: mcxiaoke
 * Date: 13-6-13
 * Time: 下午3:22
 */
public interface IPackageMonitor {

    public void onPackageAdded(String packageName, int uid);

    public void onPackageRemoved(String packageName, int uid);

    public void onPackageModified(String packageName);

    public void onPackageChanged(String packageName, int uid, String[] components);

    public void onUidRemoved(int uid);
}

/*
 * Copyright (c) 2000, 2018, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package java.util.prefs;

/**
 * Implementation of  <tt>PreferencesFactory</tt> to return
 * WindowsPreferences objects.
 *
 * @author  Konstantin Kladko
 * @see Preferences
 * @see WindowsPreferences
 * @since 1.4
 */
class WindowsPreferencesFactory implements PreferencesFactory  {

    /**
     * Returns WindowsPreferences.userRoot
     */
    @Override
    public Preferences userRoot() {
        return WindowsPreferences.getUserRoot();
    }

    /**
     * Returns WindowsPreferences.systemRoot
     */
    @Override
    public Preferences systemRoot() {
        return WindowsPreferences.getSystemRoot();
    }
}

package android.content;

import java.util.Map;
import java.util.Set;

public interface SharedPreferences {
    Map<String, ?> getAll();

    String getString(String var1, String var2);

    Set<String> getStringSet(String var1, Set<String> var2);

    int getInt(String var1, int var2);

    long getLong(String var1, long var2);

    float getFloat(String var1, float var2);

    boolean getBoolean(String var1, boolean var2);

    boolean contains(String var1);

    Editor edit();

    void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener var1);

    void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener var1);

    public interface OnSharedPreferenceChangeListener {
        void onSharedPreferenceChanged(SharedPreferences var1, String var2);
    }

    public interface Editor {
        Editor putString(String var1, String var2);

        Editor putStringSet(String var1, Set<String> var2);

        Editor putInt(String var1, int var2);

        Editor putLong(String var1, long var2);

        Editor putFloat(String var1, float var2);

        Editor putBoolean(String var1, boolean var2);

        Editor remove(String var1);

        Editor clear();

        boolean commit();

        void apply();
    }
}
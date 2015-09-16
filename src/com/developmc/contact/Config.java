package com.developmc.contact;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class Config {

	public static final String KEY_TOKEN = "token" ;
	public static final String APP_ID = "com.developmc.contact" ;
	
	/**获取程序缓存token
	 * @param context
	 * @return
	 */
	public static String getCachedToken(Context context)
	{
		SharedPreferences preferences = context.getSharedPreferences(APP_ID, Context.MODE_PRIVATE);
		return preferences.getString(KEY_TOKEN, null) ;
	}
	/**缓存token,写进sharedPreference
	 * @param context
	 * @param token
	 */
	public static void cachedToken(Context context,String token)
	{
		Editor editor = context.getSharedPreferences(APP_ID, Context.MODE_PRIVATE).edit() ;
		editor.putString(KEY_TOKEN, token) ;
		editor.commit() ;
	}
}

package com.developmc.contact;

import com.developmc.contact.activity.LoginActivity;
import com.developmc.contact.activity.TimelineActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


/**
 * @author Devel_000
 * MainActivity是程序入口,根据不同状态跳转到相应activity
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        String token = Config.getCachedToken(this) ;
        if(token!=null)
        {
        	Intent intent = new Intent(this,TimelineActivity.class) ;
        	intent.putExtra(Config.KEY_TOKEN, token) ;
        	startActivity(intent) ;
        }
        else {
			startActivity(new Intent(this,LoginActivity.class)) ;
		}
        finish() ;
    }
}

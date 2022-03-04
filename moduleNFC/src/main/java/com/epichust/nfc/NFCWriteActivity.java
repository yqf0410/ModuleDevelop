package com.epichust.nfc;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.olc.nfcmanager.Constants;
import com.olc.nfcmanager.ISO15693.I15693Utils;
import com.olc.nfcmanager.ParseListener;
import com.olc.nfcmanager.R;
import com.olc.nfcmanager.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yuanbao on 2019/3/21
 */
public class NFCWriteActivity extends Activity implements ParseListener {

    @Override
    public void onParseComplete(String result) {

    }
}
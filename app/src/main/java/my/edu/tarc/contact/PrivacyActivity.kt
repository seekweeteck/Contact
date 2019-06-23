package my.edu.tarc.contact

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_privacy.*

class PrivacyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val cm = this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = cm.activeNetworkInfo
        val isConnected = activeNetwork?.isConnected == true
        if(isConnected){
            //Loading a web page
            setContentView(R.layout.activity_privacy)
            webview_privacy.loadUrl("http://bait2073.000webhostapp.com/")
        }else
            setContentView(R.layout.layout_offline)

    }
}

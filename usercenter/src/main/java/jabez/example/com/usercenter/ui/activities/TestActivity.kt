package jabez.example.com.usercenter.ui.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jabez.example.com.usercenter.R
import org.jetbrains.anko.toast

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        toast("${intent.getIntExtra("id", -1)}")
    }
}

package ua.iGodmode.Pedometer;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.content.*;
import android.net.*;

public class AuthorActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.author);
	}
	@Override
	public void iVK(View view) {
		Intent intent =new Intent(Intent.ACTION_VIEW);    
		intent.setData(Uri.parse("http://vk.com/id253959992"));    
		startActivity(Intent.createChooser(intent,"Каким браузером просмотреть желаете?"));
		}
	@Override
	public void i4PDA(View view) {
		Intent intent =new Intent(Intent.ACTION_VIEW);    
		intent.setData(Uri.parse("http://4pda.ru/forum/index.php?showuser=4798228"));    
		startActivity(Intent.createChooser(intent,"Каким браузером просмотреть желаете?"));
	}
}

package dnn.popularmovies;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

/**
 * Created by deivi on 14/12/2016.
 */
public class Detail extends AppCompatActivity {

    ImageView bmImage;
    TextView title,sinopse,release,rated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        ImageView bmImage = (ImageView)findViewById(R.id.posterd);
        title =(TextView) findViewById(R.id.titled);
        rated =(TextView) findViewById(R.id.ratedd);
        sinopse =(TextView) findViewById(R.id.sinopsed);
        release =(TextView) findViewById(R.id.releaseDated);

        //get data from intent
        Bundle extras =  getIntent().getExtras();
        title.setText(extras.getString("title"));
        rated.setText("Vote Average:"+extras.getString("rated"));
        sinopse.setText("Plot Synopsis:"+extras.getString("sinopse"));
        release.setText("Release Date:"+extras.getString("release"));

        //donwload poster movie
        new DownloadImageTask(bmImage).execute(extras.getString("poster"));


    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
            Log.d("baxando", "");
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = Util.POSTER_URL + urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
                MainActivity.progress.dismiss();

        }
    }
}

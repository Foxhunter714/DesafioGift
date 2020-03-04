package cl.desafiolatam.desafio1;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.imageViewRight)
    ImageView imageViewRight;
    @BindView(R.id.imageViewLeft)
    ImageView imageView;
    @BindView(R.id.imageViewCenter)
    ImageView imageViewCenter;
    @BindView(R.id.imageViewResult)
    ImageView imageViewResult;

    List<Integer> regalos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        regalos = new ArrayList<Integer>();

        regalos.add(R.drawable.ic_gift_beach);
        regalos.add(R.drawable.ic_gift_music);
        regalos.add(R.drawable.ic_gift_pizza);
        regalos.add(R.drawable.ic_headset_black_24dp);
        regalos.add(R.drawable.ic_flight_takeoff_black_24dp);
        regalos.add(R.drawable.ic_whatshot_black_24dp);

    }

    @OnClick(R.id.imageViewLeft)
    void submitLeft() {
        imageViewResult.setImageResource(regalos.get(aleatorio()));
        imageViewResult.setVisibility((View.VISIBLE));
    }

    @OnClick(R.id.imageViewCenter)
    void submitCenter() {
        imageViewResult.setImageResource(regalos.get(aleatorio()));
        imageViewResult.setVisibility((View.VISIBLE));
    }

    @OnClick(R.id.imageViewRight)
    void submitRight() {
        imageViewResult.setImageResource(regalos.get(aleatorio()));
        imageViewResult.setVisibility((View.VISIBLE));
    }

    public int aleatorio() {
        Random random = new Random();
        int valor = random.nextInt(regalos.size());
        //   Log.d(Tag,Integer.toString(valor));
        return valor;
    }


}

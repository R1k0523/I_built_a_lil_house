package com.example.drawings;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.view.View;

import androidx.annotation.RequiresApi;
public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        Path path = new Path();
        Path path1 = new Path();
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#BBBBFF"));
        canvas.drawRect(0, 0, 800, 1000, paint);
        paint.setColor(Color.parseColor("#008000"));
        canvas.drawRect(0, 700, 800, 1400, paint);
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(60, 60, 75, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1);
        for (float a = -180; a < 180; a += 1.25f) {
            canvas.drawLine(60, 60, (float) (60  + 200 * Math.cos(Math.toRadians(-a))), (float) (60  - 200 * Math.sin(Math.toRadians(-a))), paint);
        }
        paint.setStrokeWidth(5);
        paint.setColor(Color.parseColor("#804000"));
        paint.setStyle(Paint.Style.FILL);
        path1.moveTo(100, 800);
        path1.lineTo(400, 800);
        path1.lineTo(250, 600);
        path1.lineTo(100, 800);
        canvas.drawPath(path1, paint);

        path1.moveTo(100, 800);
        path1.lineTo(100, 1032);
        path1.lineTo(400, 1032);
        path1.lineTo(400, 800);
        path1.lineTo(100, 800);
        canvas.drawPath(path1, paint);
        paint.setColor(Color.parseColor("#000000"));
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);
        path1.moveTo(100, 800);
        path1.lineTo(400, 800);
        path1.lineTo(250, 600);
        path1.lineTo(100, 800);
        canvas.drawPath(path1, paint);

        path1.moveTo(100, 800);
        path1.lineTo(100, 1032);
        path1.lineTo(400, 1032);
        path1.lineTo(400, 800);
        path1.lineTo(100, 800);
        canvas.drawPath(path1, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#00AA00"));
        canvas.drawOval(400, 400, 600, 900, paint);
        paint.setColor(Color.parseColor("#804000"));
        canvas.drawRect(490, 900, 510, 950, paint);

        paint.setColor(Color.parseColor("#777777"));
        canvas.drawRect(410, 1000, 610, 1030, paint);
        canvas.drawRect(430, 1030, 440, 1070, paint);
        canvas.drawRect(580, 1030, 590, 1070, paint);
        paint.setColor(Color.parseColor("#000000"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        canvas.drawRect(410, 1000, 610, 1030, paint);
        canvas.drawRect(430, 1030, 440, 1070, paint);
        canvas.drawRect(580, 1030, 590, 1070, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(250, 700, 50, paint);
        paint.setStrokeWidth(0.2f);
        for (float a = -45; a < 135; a += 0.4f) {
            canvas.drawLine((float) (250 + 50 * Math.cos(Math.toRadians(a + 90))), (float) (700 - 50 * Math.sin(Math.toRadians(a + 90))), (float) (250 + 50 * Math.cos(Math.toRadians(-a))), (float) (700 - 50 * Math.sin(Math.toRadians(-a))), paint);
        }
        paint.setColor(Color.parseColor("#000000"));
        paint.setStrokeWidth(5);
        canvas.drawRect(145, 850, 200, 1032, paint);
        float sx = 200, sy = 850, tx = 200, ty = 850;
        while (sx>150 || sy<1000 || tx>150 || ty<1000) {
            if (sx>150) sx-=10*Math.sqrt(2); else sy+=10;
            if (sy<1000) ty+=10; else tx-=10*Math.sqrt(2);
            canvas.drawLine (sx, sy, tx, ty, paint);
        }
        canvas.drawRect(230, 850, 330, 950, paint);
        paint.setStrokeWidth(2);
        for (int i = 0; i<100; i+=10) {
            canvas.drawLine (230, 850+i, 330, 850+i, paint);
            canvas.drawLine (230+i, 850, 230+i, 950, paint);
        }
    }
}

package Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Livia on 15/01/2016.
 */
public class DBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "dbMovies";
    public static final int DB_VERSION = 1;
    public static final String TBL_MOVIES = "tbl_Movies";

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TBL_MOVIES + "(" +
                COL_dbID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_IMDBID + " TEXT, " +
                COL_TITLE + " TEXT, " +
                COL_YEAR + " TEXT, " +
                COL_RATED + " TEXT, " +
                COL_RELEASED + " TEXT, " +
                COL_GENRE + " TEXT, " +
                COL_DIRECTOR + " TEXT, " +
                COL_ACTORS + " TEXT, " +
                COL_PLOT + " TEXT, " +
                COL_LANGUAGE + " TEXT, " +
                COL_POSTER + " TEXT, " +
                COL_SCORE + " TEXT )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public static final String COL_dbID = "col_dbId";
    public static final String COL_IMDBID = "col_imdbid";
    public static final String COL_TITLE = "col_title";
    public static final String COL_YEAR = "col_year";
    public static final String COL_RATED = "col_rated";
    public static final String COL_RELEASED = "col_released";
    public static final String COL_GENRE = "col_genre";
    public static final String COL_DIRECTOR = "col_director";
    public static final String COL_ACTORS = "col_actors";
    public static final String COL_PLOT = "col_plot";
    public static final String COL_LANGUAGE = "col_language";
    public static final String COL_POSTER = "col_poster";
    public static final String COL_SCORE = "col_score";




/*
    Title
Year
Rated
Released
Runtime
Genre
Director
Writer
Actors
Plot
Language
Country
Awards
Poster
Metascore
imdbRating
imdbVotes
imdbID
Type
Response

*/

}

package op.mobile.app.dev.johnil1.travelling.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance(private val url: String) {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val retrofitCountryService: ICountry by lazy {
        retrofit.create(ICountry::class.java)
    }

    val retrofitTranslateService: ITranslate by lazy {
        retrofit.create(ITranslate::class.java)
    }
}

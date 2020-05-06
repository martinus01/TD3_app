package com.example.td3_app;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokeApi {
    @GET(" /api/v2/pokemon")
    Call<RestPokemonResponse> getPokemonResponse();

}

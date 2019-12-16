# Recipes Search Demo
<p>Demo app for testing RestApi Calls.
A food recipe search app with retrofit, livedata and using android best practices.</p>
<p>The app is currently not being developed.</p>
<p>The UI was developed as far as enough for displaying the results.</p>
<h1>Screenshots</h1>

![Category Selection](screens/screen1.png "Category Selection")
![List of recipes1](screens/screen2.png "List of searched recipes 1")
![List of recipes2](screens/screen3.png "List of searched recipes 2")
<br></br>
![Recipe details no internet](screens/screen5.png "Recipe details")
![Recipe details no internet](screens/screen4.png "Recipe details without cache")
![List of recipes3](screens/screen6.png "List of searched recipes 3")
  <br>
  <br>
<h1>Libraries Used</h1>
  <p><b>Lifecycles</b>- Create a UI that automatically responds to lifecycle events.</p>
  <p><b>LiveData</b> - Build data objects that notify views when the underlying database changes.</p>
  <p><b>Room</b> - Caching the network data for offline use.</p> 
  <p><b>ViewModel</b> - Persist the data on configuration changes.</p>
  <p><b>Glide</b> - Image Loading.</p>
  <p><b>Retrofit</b> - Http Requests.</p>
  <p><b>Gson</b> - Convert Json objects.</p>
  <p><b>Circle Imageview</b> - Display images in a circle.</p>
  <p><b>RecyclerView </b> - Display list and handle clicks.</p>
  <br>
<h1>Non-Goals</h1>
  <p>The focus of this project was on HTTP requests and caching the data for offline use using the MVVM pattern.</p>
  <p>The UI only was worked till the point were we could get and display the results from the requests.</p>
  <br>
<h1>App architecture</h1>
  <p>The app was developed taking in account the best practices and recommended architecture from Google for building apps.</p>
  <div class="center" align="center">
    <img class="center" src="https://developer.android.com/topic/libraries/architecture/images/final-architecture.png" height="400">
  </div>


# Recipes Search Demo
<p>Demo app for testing RestApi Calls.
A food recipe search app with retrofit, livedata and using android best practices.</p>
<p>The app is currently not being developed.
<br>
<br>
<h1>Screenshots</h1>

![Category Selection](screens/screen1.png "Category Selection")
![List of recipes1](screens/screen2.png "List of searched recipes 1")
![List of recipes2](screens/screen3.png "List of searched recipes 2")
<br><br>
![Recipe details no internet](screens/screen5.png "Recipe details")
![Recipe details no internet](screens/screen4.png "Recipe details without cache")
![List of recipes3](screens/screen6.png "List of searched recipes 3")
  
  
<h1>Libraries Used</h1>
  <p>Lifecycles- Create a UI that automatically responds to lifecycle events.</p>
  <p>LiveData - Build data objects that notify views when the underlying database changes.</p>
  <p>Room - Caching the network data for offline use.</p> 
  <p>ViewModel - Persist the data on configuration changes.</p>
  <p>Glide - Image Loading.</p>
  <p>Retrofit - Http Requests.</p>
  <p>Gson - Convert Json objects.</p>
  <p>Circle Imageview - Display images in a circle.</p>
  
<h1>Non-Goals</h1>
The focus of this project was on HTTP requests and caching the data for offline use using the MVVM pattern.
<p>The UI only was worked till the point were we can get and display the results less design time was spent.</p>

<h1>App architecture</h1>
<br>
<p>The app was developed taking in account the best practices and recommended architecture from Google for building apps.</p>
<img src="https://developer.android.com/topic/libraries/architecture/images/final-architecture.png" height="400">

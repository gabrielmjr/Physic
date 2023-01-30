<h1>Physic</h1>
 <h4>Physical Calculations on Java</h4>

<h2>Info</h2>

**Actual version:** [1.0.4-Beta_4](https://github.com/gabrielmjr/Physic/releases/tag/v1.0.4-beta_1)

**Latest release:** [1.0.3-Release](https://github.com/gabrielmjr/Physic/releases/tag/v1.0.3)


**Package:** 

    com.gabrielMJr.twaire.physic


<h5>Maven dependency:</h5>

**Step 1: Add the Jitpack repository to your ~/.m2/settings.xml file**

    <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
    </repository>


**Step 2: Add the Physic dependency to your maven project directory**

    <dependency>
      <groupId>com.github.gabrielmjr</groupId>
      <artifactId>Physic</artifactId>
      <version>[Tag]</version>
    </dependency>


<h5>Gradle dependency</h5>

**Step1: Add the Jitpack IO repository url into your top level build.gradle file**

    allprojects {
        repositories {
	    ...
            maven { url 'https://jitpack.io' }
        }
    }


***Step 2: Add the Physic dependency into dependency in build.gradle app module***

    dependencies {
        implementation 'com.github.gabrielmjr:Physic:Tag'
    }


<h2>Documentation</h2>
<h3>Public classes</h3>
<h4>Main class</h4>

Name: **Physic**

Class path: 

    com.gabrielMJr.twaire.physic.Physic


<h5>Constants</h5>

name: `static int GET_RESULT`
value: `0`


name: `static int GET_STEP`
value: `1`

When use calculation methods with more than 2 doubles parameters, those constants are used to choose between just get result of the passed value our get for each step calculations in a String.



<h4>
  <a href="">Kinematics calculations><a>
</h4>

This feature do calculations of Uniform Rectilinear Motion such as:
* Constant speed of a travelled distance by an object;
* Time spent during a trajectory; 
* Travelled distance by an object;

Uniformly Varied Movement:
* Acceleration of an object;
* Speed ​​variation during a trip;
* Time spent during a trajectory; 
* Travelled distance by an object;



<h4>
  <a href="">Hydrodynamics calculation<a>
</h4>

This feature do calculations of Volumetric Flow such as:
* Area of ​​a flow tube;
* Speed ​​of flow of a stream;
* Ray of a flow tube;
* Time interval of a flow;
* Flow rate to be occupied by a fluid flow in a determined time;
* Volume ocuped.




<h4>
  <a href="">Area converter</a>
</h4>

This feature converts bellow units of area from one to another:
* Square_kilometer - "km²";
* Square_hectometer - "hm²";
* Square_decameter - "dam²"
* Square_meter - "m²";
* Square_decimeter - "dm²";
* Square_centimeter - "cm²";
* Square_millimeter - "mm²".




<h4>
  <a href="">Distance converter</a>
</h4>

This feature converts bellow units of distance from one to another:
* Kilometer - "km";
* Hectometer - "hm";
* Decameter - "dam"
* Meter - "m";
* Decimeter - "dm";
* Centimeter - "cm";
* Millimeter - "mm".




<h4>
  <a href="">Speed converter </a>
</h4>

This feature converts bellow units of speed from one to another:
* Kilometer_per_second - "km/s";
* Hectometer_per_second - "hm/s";
* Decameter_per_second - "dam/s"
* Meter_per_second - "m/s";
* Decimeter_per_second - "dm/s";
* Centimeter_per_second - "cm/s";
* Millimeter_per_second - "mm/s".

<p></p>

* Kilometer_per_minute - "km/min";
* Hectometer_per_minute - "hm/min";
* Decameter_per_minute - "dam/min"
* Meter_per_minute - "m/min";
* Decimeter_per_minute - "dm/min";
* Centimeter_per_minute - "cm/min";
* Millimeter_per_minute - "mm/min".

<p></p>

* Kilometer_per_hour - "km/h";
* Hectometer_ler_hour - "hm/h";
* Decameter_per_hour - "dam/h"
* Meter_per_hour - "m/h";
* Decimeter_per_hour - "dm/h";
* Centimeter_per_hour - "cm/h";
* Millimeter_per_hour - "mm/h".




<h4>
  <a href="">Volume conversor</a>
</h4>

This feature converts bellow units of area from one to another:
* Cube_kilometer - "km³";
* Cube_hectometer - "hm³";
* Cube_decameter - "dam³"
* Cube_meter - "m³";
* Cube_decimeter - "dm³";
* Cube_centimeter - "cm³";
* Cube_millimeter - "mm³".




<h2>License</h2>
Copyright 2022 [Gabriel MJr](https://gitHub.com/gabrielmjr)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

[Apache License v2-2004)](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

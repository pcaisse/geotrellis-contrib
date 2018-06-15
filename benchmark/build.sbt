name := "benchmark"

enablePlugins(JmhPlugin)

unmanagedJars in Compile ++= Seq(
  file("lib/imageio-ext-gdalframework-1.1.24.jar"),
  file("lib/imageio-ext-gdalgeotiff-1.1.24.jar"),
  file("lib/imageio-ext-gdaljpeg-1.1.24.jar"),
  file("lib/jai_codec-1.1.3.jar"),
  file("lib/jai_core-1.1.3.jar"),
  file("lib/jai_imageio-1.1.jar")
)

libraryDependencies ++= Seq(
  "org.locationtech.geotrellis" %% "geotrellis-raster" % "1.2.1"
)

(defproject cascalog-examples "0.1.0-SNAPSHOT"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [cascalog "2.1.1"]]

  :profiles {:uberjar  {:aot :all}
             :provided {:dependencies [[org.apache.hadoop/hadoop-client "2.6.0"]
                                       [org.apache.hadoop/hadoop-mapreduce-client-core "2.6.0"]]}
             :dev      {:dependencies [[org.apache.hadoop/hadoop-minicluster "2.6.0"]]}})


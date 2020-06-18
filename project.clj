(defproject post-my-standup "0.1.0-SNAPSHOT"
  :description "This is a Slack app that aims to make your daily standup easier"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot post-my-standup.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

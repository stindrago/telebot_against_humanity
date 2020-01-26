(defproject telebot_against_humanity "0.1.0-SNAPSHOT"
  :description "A bot that replicates the game Cards against Humanity (https://www.cardsagainsthumanity.com)"
  :url "https://gitlab.com/aredots/telebot_against_humanity"

  :license {:name "The GNU General Public License v3.0"
            :url "https://www.gnu.org/licenses/gpl-3.0.en.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [environ             "1.1.0"]
                 [morse               "0.2.4"]]

  :plugins [[lein-environ "1.1.0"]]

  :main ^:skip-aot telebot-against-humanity.core
  :target-path "target/%s"

  :profiles {:uberjar {:aot :all}})

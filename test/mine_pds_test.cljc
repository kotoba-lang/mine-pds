(ns mine_pds-test
  (:require [clojure.test :refer [deftest is testing]]
            [mine_pds]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? mine_pds))))

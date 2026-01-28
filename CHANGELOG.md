# Changelog

## 0.1.0-alpha.2 (2026-01-28)

Full Changelog: [v0.1.0-alpha.1...v0.1.0-alpha.2](https://github.com/hanzoai/kotlin-sdk/compare/v0.1.0-alpha.1...v0.1.0-alpha.2)

### ⚠ BREAKING CHANGES

* **client:** extract auto pagination to shared classes
* **client:** **Migration:** - If you were referencing the `AutoPager` class on a specific `*Page` or `*PageAsync` type, then you should instead reference the shared `AutoPager` and `AutoPagerAsync` types, under the `core` package
    - If you were referencing `getNextPage` or `getNextPageParams`:
       - Swap to `nextPage()` and `nextPageParams()`
       - Note that these both now return non-nullable types (use `hasNextPage()` before calling these, since they will throw if it's impossible to get another page)

### Features

* **api:** api update ([b7d512b](https://github.com/hanzoai/kotlin-sdk/commit/b7d512b6d0b44e1ed211ed566e8a3659b7d0a346))
* **api:** api update ([cee50c0](https://github.com/hanzoai/kotlin-sdk/commit/cee50c0c3ae2f868eb04dcb7f98461772fe81801))
* **api:** api update ([ddbf477](https://github.com/hanzoai/kotlin-sdk/commit/ddbf47763029a567126f8dfd9a26630a299f0752))
* **api:** api update ([d0143ba](https://github.com/hanzoai/kotlin-sdk/commit/d0143baa89aa98317ebbea8722ab50c0e1d70dd2))
* **api:** api update ([#8](https://github.com/hanzoai/kotlin-sdk/issues/8)) ([7ccb4d3](https://github.com/hanzoai/kotlin-sdk/commit/7ccb4d3fd66950ef7c0974cab1b0bcbef05242e6))
* **client:** add enum validation method ([add1c8a](https://github.com/hanzoai/kotlin-sdk/commit/add1c8a2cbd17e21178bdbdac3fca19ce56db265))
* **client:** allow providing some params positionally ([9944163](https://github.com/hanzoai/kotlin-sdk/commit/9944163fb25979e444ac732e179a9e0f2b800993))
* **client:** expose request body setter and getter ([#14](https://github.com/hanzoai/kotlin-sdk/issues/14)) ([bbc39ef](https://github.com/hanzoai/kotlin-sdk/commit/bbc39efe887abb3e5b0ea2e4033f8486a6c4154d))
* **client:** extract auto pagination to shared classes ([a7c40cc](https://github.com/hanzoai/kotlin-sdk/commit/a7c40ccf55cc1c4fd848e4835843992b8bcfbbf5))
* **client:** make datetime deserialization more lenient ([#13](https://github.com/hanzoai/kotlin-sdk/issues/13)) ([167918e](https://github.com/hanzoai/kotlin-sdk/commit/167918e58e03be67689b3ce4d07721532f24eed1))
* **client:** make union deserialization more robust ([#12](https://github.com/hanzoai/kotlin-sdk/issues/12)) ([add1c8a](https://github.com/hanzoai/kotlin-sdk/commit/add1c8a2cbd17e21178bdbdac3fca19ce56db265))
* **client:** support setting base URL via env var ([8031b00](https://github.com/hanzoai/kotlin-sdk/commit/8031b0092576480fd842f8c85213579da672c9de))


### Bug Fixes

* **client:** add missing convenience methods ([e5754dc](https://github.com/hanzoai/kotlin-sdk/commit/e5754dce17f186df62ec282bfc8acc92b0ba14b2))
* **client:** bump to better jackson version ([b6ccd50](https://github.com/hanzoai/kotlin-sdk/commit/b6ccd50fb54ffc87783d2b540505a1d8953d4be3))
* **client:** don't call `validate()` during deserialization if we don't have to ([#9](https://github.com/hanzoai/kotlin-sdk/issues/9)) ([fd94704](https://github.com/hanzoai/kotlin-sdk/commit/fd947044521d13d604c3422635f4671334cca0af))
* **client:** limit json deserialization coercion ([#10](https://github.com/hanzoai/kotlin-sdk/issues/10)) ([ab26343](https://github.com/hanzoai/kotlin-sdk/commit/ab26343c0213099a2251b387a1f4b088acb0e788))
* pluralize `list` response variables ([#11](https://github.com/hanzoai/kotlin-sdk/issues/11)) ([1efcda4](https://github.com/hanzoai/kotlin-sdk/commit/1efcda48a5c7c2e6c5a585ae13039bc30230f917))


### Performance Improvements

* **client:** cached parsed type in `HttpResponseFor` ([#16](https://github.com/hanzoai/kotlin-sdk/issues/16)) ([63e4662](https://github.com/hanzoai/kotlin-sdk/commit/63e46627a7e4ec8bdd5a5f6d5d41b8ad9f42f17a))
* **internal:** improve compilation+test speed ([128a5ad](https://github.com/hanzoai/kotlin-sdk/commit/128a5ad8ec69661e3918cad8624e943803e77f68))


### Chores

* **ci:** add timeout thresholds for CI jobs ([a94c832](https://github.com/hanzoai/kotlin-sdk/commit/a94c832a4d0fc56c3d0c343468017b64225a55a5))
* **ci:** only use depot for staging repos ([be2f2ee](https://github.com/hanzoai/kotlin-sdk/commit/be2f2ee8268e2cf1187ce7e67542fcdee50a065b))
* **client:** remove unnecessary json state from some query param classes ([add1c8a](https://github.com/hanzoai/kotlin-sdk/commit/add1c8a2cbd17e21178bdbdac3fca19ce56db265))
* configure new SDK language ([ad50300](https://github.com/hanzoai/kotlin-sdk/commit/ad5030070351535c54860cfa83af4000b754fc63))
* **docs:** grammar improvements ([38eb7af](https://github.com/hanzoai/kotlin-sdk/commit/38eb7af100079313f17814d0e9862925dcbf8965))
* **internal:** add invalid json deserialization tests ([add1c8a](https://github.com/hanzoai/kotlin-sdk/commit/add1c8a2cbd17e21178bdbdac3fca19ce56db265))
* **internal:** add json roundtripping tests ([add1c8a](https://github.com/hanzoai/kotlin-sdk/commit/add1c8a2cbd17e21178bdbdac3fca19ce56db265))
* **internal:** codegen related update ([b4b54e0](https://github.com/hanzoai/kotlin-sdk/commit/b4b54e0579a2e24d390fa8f573088c4fc4be46e1))
* **internal:** codegen related update ([2d2bd1d](https://github.com/hanzoai/kotlin-sdk/commit/2d2bd1d9a3da1d326bd03308f298ee8a5eff8697))
* **internal:** expand CI branch coverage ([acde7dc](https://github.com/hanzoai/kotlin-sdk/commit/acde7dc91fd42b088d7dfe048ff1068a1d249c38))
* **internal:** java 17 -&gt; 21 on ci ([61663b1](https://github.com/hanzoai/kotlin-sdk/commit/61663b18ca7aa9fd8713520cc9045477773a06de))
* **internal:** reduce CI branch coverage ([ff665c6](https://github.com/hanzoai/kotlin-sdk/commit/ff665c6403987a8f2b3f30bbe79973d8a09293fa))
* **internal:** remove flaky `-Xbackend-threads=0` option ([5f84351](https://github.com/hanzoai/kotlin-sdk/commit/5f84351d50673a5bbfc4fd395219269c310e2f89))
* **internal:** update java toolchain ([1d40e48](https://github.com/hanzoai/kotlin-sdk/commit/1d40e48739a1c6a441fba7b52e19e21e75bb0616))
* **internal:** use `byteInputStream()` in tests ([e5754dc](https://github.com/hanzoai/kotlin-sdk/commit/e5754dce17f186df62ec282bfc8acc92b0ba14b2))
* update SDK settings ([#6](https://github.com/hanzoai/kotlin-sdk/issues/6)) ([76e44a1](https://github.com/hanzoai/kotlin-sdk/commit/76e44a110dfa82544d0a459f1dcca1b027d76347))


### Documentation

* add comments to `JsonField` classes ([#17](https://github.com/hanzoai/kotlin-sdk/issues/17)) ([fd38694](https://github.com/hanzoai/kotlin-sdk/commit/fd386943daf6826b90591dcbebf5715488ce9884))
* **client:** update jackson compat error message ([23f7fd3](https://github.com/hanzoai/kotlin-sdk/commit/23f7fd3232788a67af65219b990f2f68703206b0))
* document how to forcibly omit required field ([4b850cc](https://github.com/hanzoai/kotlin-sdk/commit/4b850ccd2104249fbfa799e68f9abacc23cf3078))
* explain http client customization ([843002c](https://github.com/hanzoai/kotlin-sdk/commit/843002c7e5777a10e8aa466673a9d0f8e8b6672e))
* explain jackson compat in readme ([660c061](https://github.com/hanzoai/kotlin-sdk/commit/660c0612284f5f85893d106725e6f6f52ed1e07c))
* swap examples used in readme ([#18](https://github.com/hanzoai/kotlin-sdk/issues/18)) ([4b850cc](https://github.com/hanzoai/kotlin-sdk/commit/4b850ccd2104249fbfa799e68f9abacc23cf3078))
* update documentation links to be more uniform ([5b7f54b](https://github.com/hanzoai/kotlin-sdk/commit/5b7f54b49836e371985de3e7611a1e8daf8cca31))

## 0.1.0-alpha.1 (2025-03-27)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/hanzoai/kotlin-sdk/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### Features

* **api:** api update ([#4](https://github.com/hanzoai/kotlin-sdk/issues/4)) ([b312b26](https://github.com/hanzoai/kotlin-sdk/commit/b312b26188d2ebf8e2b9d53aef10c14f9f572a35))
* **api:** manual updates ([#3](https://github.com/hanzoai/kotlin-sdk/issues/3)) ([691ba0a](https://github.com/hanzoai/kotlin-sdk/commit/691ba0a8730d578795562a44b46760e05d09a2c5))


### Chores

* configure new SDK language ([250dfca](https://github.com/hanzoai/kotlin-sdk/commit/250dfca79bd42ab98fd2f434535a5541e0c71012))
* go live ([#1](https://github.com/hanzoai/kotlin-sdk/issues/1)) ([d630698](https://github.com/hanzoai/kotlin-sdk/commit/d63069855e9f917bbeb0f460e923d5c24c2653ea))

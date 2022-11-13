# V4

- pretrained MobileNetV2 (imagenet)
- unfreeze weights
- GlobalAveragePooling2D, Dropout(0.2), Dense(64, activation="relu"), Dropout(0.2), Dense(32, activation="relu"), Dropout(0.2), Dense(4, activation="softmax")
- learning rate 0.00001
- optimizer Adam
- SparseCategoricalCrossentropy
- weighted classes [1.5, 0.40, 1.7, 3.25]

- Trained on CityPersons dataset
- train 2602
- val 365
- test 500
- epochs 5 (because of very long training, resource constrained)
- bach size 4 (maybe better than 8 before)
- IMG_W = 512 !!
- IMG_H = 512 !!

# labels
- ignore
- safe pedestrian
- be careful
- break


# Results

| precision                 | recall | f1-score | support | support |
|---------------------------|--------|----------|---------|---------|
| Ignore (Class 0)          | 0.00   | 0.00     | 0.00    | 59      |
| safe pedestrian (Class 1) | 0.60   | 0.94     | 0.73    | 252     |
| Be careful (Class 2)      | 0.50   | 0.23     | 0.32    | 108     |
| Break (Class 3)           | 0.85   | 0.54     | 0.66    | 81      |
| accuracy                  |        |          | 0.61    | 500     |
| macro avg                 | 0.49   | 0.43     | 0.43    | 500     |
| weighted avg              | 0.55   | 0.61     | 0.54    | 500     |

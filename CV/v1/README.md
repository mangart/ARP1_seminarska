# V1

- pretrained MobileNetV2 (imagenet)
- freeze weights
- GlobalAveragePooling2D, Dropout(0.2), Dense(64, activation="relu"), Dropout(0.2), Dense(32, activation="relu"), Dropout(0.2), Dense(4, activation="softmax")
- learning rate 0.00001
- optimizer Adam
- SparseCategoricalCrossentropy
- weighted classes [1.5, 0.45, 1.5, 3]

- Trained on CityPersons dataset
- train 2602
- val 365
- test 500
- epochs 1
- bach size 8

# labels
- ignore
- safe pedestrian
- be careful
- break


# Results

|                           | precision | recall | f1-score | support |
|---------------------------|-----------|--------|----------|---------|
| Ignore (Class 0)          | 0.20      | 0.02   | 0.03     | 59      |
| safe pedestrian (Class 1) | 0.51      | 0.99   | 0.67     | 252     |
| Be careful (Class 2)      | 0.00      | 0.00   | 0.00     | 108     |
| Break (Class 3)           | 0.00      | 0.00   | 0.00     | 81      |
| accuracy                  |           |        | 0.50     | 500     |
| macro avg                 | 0.18      | 0.25   | 0.18     | 500     |
| weighted avg              | 0.28      | 0.50   | 0.34     | 500     |

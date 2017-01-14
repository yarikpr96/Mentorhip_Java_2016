package CoolTasks_1.Football;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Objects> list = new ArrayList<Objects>();
        Random random = new Random();


        list.add(new Objects("Dynamo       ", 0));
        list.add(new Objects("Shakhtar     ", 0));
        list.add(new Objects("Dnipro       ", 0));
        list.add(new Objects("Metalist     ", 0));
        list.add(new Objects("Karpaty      ", 0));
        list.add(new Objects("Zorya        ", 0));
        list.add(new Objects("Alexandria   ", 0));
        list.add(new Objects("Volyn        ", 0));
        list.add(new Objects("Chernomorets ", 0));
        list.add(new Objects("Olimpik      ", 0));

        for (Objects objects : list) {
            if (objects.getName().equals("Dynamo       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dynamo       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dynamo       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dynamo       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dynamo       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dynamo       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dynamo       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dynamo       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dynamo       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        //---------------------------B
        for (Objects objects : list) {
            if (objects.getName().equals("Shakhtar     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Shakhtar     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Shakhtar     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Shakhtar     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Shakhtar     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Shakhtar     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Shakhtar     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Shakhtar     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Shakhtar     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        //--------------C
        for (Objects objects : list) {
            if (objects.getName().equals("Dnipro       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dnipro       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dnipro       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dnipro       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dnipro       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dnipro       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dnipro       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dnipro       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Dnipro       ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        //-------D
        for (Objects objects : list) {
            if (objects.getName().equals("Metalist     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Metalist     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Metalist     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Metalist     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Metalist     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Metalist     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Metalist     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Metalist     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Metalist     ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        //---------E
        for (Objects objects : list) {
            if (objects.getName().equals("Karpaty      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Karpaty      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Karpaty      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Karpaty      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Karpaty      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Karpaty      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Karpaty      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Karpaty      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Karpaty      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        //------------F
        for (Objects objects : list) {
            if (objects.getName().equals("Zorya        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Zorya        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Zorya        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Zorya        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Zorya        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Zorya        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Zorya        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Zorya        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Zorya        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        //---------------G
        for (Objects objects : list) {
            if (objects.getName().equals("Alexandria   ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Alexandria   ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Alexandria   ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Alexandria   ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Alexandria   ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Alexandria   ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Alexandria   ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Alexandria   ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Alexandria   ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        //------------H
        for (Objects objects : list) {
            if (objects.getName().equals("Volyn        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Volyn        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Volyn        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Volyn        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Volyn        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Volyn        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Volyn        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Volyn        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Volyn        ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        //---------I
        for (Objects objects : list) {
            if (objects.getName().equals("Chernomorets ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Chernomorets ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Chernomorets ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Chernomorets ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Chernomorets ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Chernomorets ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Chernomorets ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Chernomorets ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Chernomorets ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Olimpik      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        //--------------J
        for (Objects objects : list) {
            if (objects.getName().equals("Olimpik      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Shakhtar     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Olimpik      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dnipro       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Olimpik      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Metalist     ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Olimpik      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Karpaty      ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Olimpik      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Zorya        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Olimpik      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Alexandria   ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Olimpik      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Volyn        ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Olimpik      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Chernomorets ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        for (Objects objects : list) {
            if (objects.getName().equals("Olimpik      ")) {
                int r = random.nextInt(3);
                if (r == 0) {
                    objects.setPoints(objects.getPoints() + 1);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 1);
                        }
                    }
                } else if (r == 1) {
                    objects.setPoints(objects.getPoints() + 3);
                } else if (r == 2) {
                    objects.setPoints(objects.getPoints() + 0);
                    for (Objects objects1 : list) {
                        if (objects1.getName().equals("Dynamo       ")) {
                            objects1.setPoints(objects1.getPoints() + 3);
                        }
                    }
                }
            }
        }
        Collections.sort(list,new Sorting());

        for (Objects objects : list) {
            System.out.println(objects);

        }
    }
}
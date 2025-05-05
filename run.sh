class=BankAccount
project_cp=.
D4J_SEED=42
budget=10
DIR_OUTPUT=out-seeded/
#DIR_OUTPUT=out/

java -cp evosuite-seed.jar shaded.org.evosuite.EvoSuite  \
    -class $class \
    -projectCP $project_cp \
    -seed $D4J_SEED \
    -Dsearch_budget=$budget \
    -Dtest_dir=$DIR_OUTPUT \
    -Dshow_progress=false \
    -Dfilter_assertions=false \
    -Dtest_comments=false \
    -Dselected_junit="Seed" \
    -Dlog.level=DEBUG \
    -mem 1500 \


#-Dtest_factory="junit" \
#-Dtest_carving=true \
